package com.example.activity_fragment_lifecycle

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class MainActivity : AppCompatActivity(R.layout.activity_main)
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        var button = findViewById<Button>(R.id.btn)
        button.setOnClickListener(View.OnClickListener { View ->
            supportFragmentManager.commit {
                replace<BlankFragment>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        })
        Log.d("MainActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","onDestroy")
    }



}