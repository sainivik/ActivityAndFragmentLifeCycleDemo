package com.sainivik.activityandfragmentlifecycledemo.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sainivik.activityandfragmentlifecycledemo.R


class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Fragment 2", "onCreate")


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("Fragment 2", "onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Fragment 2", "onAttach")

    }

    override fun onStart() {
        Log.e("Fragment 2", "onStart")

        super.onStart()
    }

    override fun onResume() {

        Log.e("Fragment 2", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("Fragment 2", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Fragment 2", "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("Fragment 2", "onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("Fragment 2", "onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("Fragment 2", "onDetach")
        super.onDetach()
    }


}