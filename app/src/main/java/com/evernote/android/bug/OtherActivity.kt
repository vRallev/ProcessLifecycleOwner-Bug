package com.evernote.android.bug

import android.arch.lifecycle.ProcessLifecycleOwner
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * @author rwondratschek
 */
class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "State is: ${ProcessLifecycleOwner.get().lifecycle.currentState}", Toast.LENGTH_SHORT).show()
    }
}