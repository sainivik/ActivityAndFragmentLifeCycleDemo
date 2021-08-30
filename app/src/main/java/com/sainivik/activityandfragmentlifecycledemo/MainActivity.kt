package com.sainivik.activityandfragmentlifecycledemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.FrameLayout
import androidx.annotation.IdRes
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.sainivik.activityandfragmentlifecycledemo.activity.SecondActivity
import com.sainivik.activityandfragmentlifecycledemo.fragment.BlankFragment
import com.sainivik.activityandfragmentlifecycledemo.fragment.SecondFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Activity 1", "onCreate")
        findViewById<Button>(R.id.btnStart).setOnClickListener {
         // finish()
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
        findViewById<Button>(R.id.btnStartFragment).setOnClickListener {
            addFragment(R.id.flContainer,BlankFragment(),"")

        }
        findViewById<Button>(R.id.btnStartSecondFragment).setOnClickListener {
            addFragment(R.id.flContainer,SecondFragment(),"")

        }
    }




    override fun onStart() {
        super.onStart()
        Log.e("Activity 1", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity 1", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity 1", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity 1", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity 1", "onDestroy")

    }

    protected fun addFragment(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        fragmentTag: String
    ) {
        supportFragmentManager
            .beginTransaction()
            .add(containerViewId, fragment, fragmentTag)
          //  .disallowAddToBackStack()
            .addToBackStack(null)
            .commit()
    }

    protected fun replaceFragment(
        @IdRes containerViewId: Int,
        fragment: Fragment,
        fragmentTag: String,
    ) {
        supportFragmentManager
            .beginTransaction()
            .replace(containerViewId, fragment, fragmentTag)
            .addToBackStack(null)
            .commit()
    }

}