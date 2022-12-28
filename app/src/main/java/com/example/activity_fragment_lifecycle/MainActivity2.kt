package com.example.activity_fragment_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        Log.d("MainActivity------2", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity------2","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity------2","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity------2","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity------2","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity------2","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity------2","onDestroy")
    }



}