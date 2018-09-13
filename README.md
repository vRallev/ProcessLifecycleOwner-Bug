# ProcessLifecycleOwner Bug
`ProcessLifecycleOwner` initializes itself with the a content provider called `ProcessLifecycleOwnerInitializer`, which is setup like this
```xml
<provider
    android:name="android.arch.lifecycle.ProcessLifecycleOwnerInitializer"
    android:authorities="com.evernote.android.bug.lifecycle-trojan"
    android:exported="false"
    android:multiprocess="true" />
```
The `multiprocess` attribute implies that the class is initialized for each process, but that isn't the case. The demo shows that the 2nd process never gets out of the `INITIALIZED` state, what means that the `ProcessLifecycleOwner` hasn't been initialized and thus `ProcessLifecycleOwnerInitializer` hasn't been created in the 2nd process.

There is currently no workaround to manually initialize `ProcessLifecycleOwner`