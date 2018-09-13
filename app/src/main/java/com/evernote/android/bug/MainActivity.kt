package com.evernote.android.bug

import android.arch.lifecycle.ProcessLifecycleOwner
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "State is: ${ProcessLifecycleOwner.get().lifecycle.currentState}", Toast.LENGTH_SHORT).show()
    }

    @Suppress("UNUSED_PARAMETER")
    fun onClick(v: View) {
        startActivity(Intent(this, OtherActivity::class.java))
    }
}
