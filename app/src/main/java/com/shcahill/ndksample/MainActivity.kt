package com.shcahill.ndksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main).apply {
            textFromJni.text = stringFromJNI()
        }
    }

    private external fun stringFromJNI(): String

    companion object {
        init {
            System.loadLibrary("jni-lib-name")
        }
    }
}
