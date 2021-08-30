package com.sainivik.activityandfragmentlifecycledemo.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sainivik.activityandfragmentlifecycledemo.R


class BlankFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Fragment 1" ,"onCreate")


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("Fragment 1" ,"onCreateView")
        return inflater.inflate(R.layout.fragment_blank, container, false)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Fragment 1" ,"onAttach")

    }

    override fun onStart() {
        Log.e("Fragment 1" ,"onStart")

        super.onStart()
    }

    override fun onResume() {

        Log.e("Fragment 1" ,"onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("Fragment 1" ,"onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("Fragment 1" ,"onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e("Fragment 1" ,"onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e("Fragment 1" ,"onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e("Fragment 1" ,"onDetach")
        super.onDetach()
    }


}