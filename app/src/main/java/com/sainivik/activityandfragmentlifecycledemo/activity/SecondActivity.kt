package com.sainivik.activityandfragmentlifecycledemo.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.sainivik.activityandfragmentlifecycledemo.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Activity 2", "onCreate")

    }



    override fun onStart() {
        super.onStart()
        Log.e("Activity 2", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity 2", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity 2", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity 2", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity 2", "onDestroy")

    }

}