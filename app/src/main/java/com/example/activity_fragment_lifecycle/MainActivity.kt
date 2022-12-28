package com.example.activity_fragment_lifecycle

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class MainActivity : AppCompatActivity(R.layout.activity_main)
{
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        var button = findViewById<Button>(R.id.btn)
        var button2 = findViewById<Button>(R.id.btnn)
        button.setOnClickListener(View.OnClickListener { View ->
            supportFragmentManager.commit {
                replace<BlankFragment>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack(null)
                button.visibility= INVISIBLE
                button2.visibility= INVISIBLE
            }
        })
        button2.setOnClickListener { View ->
            var intent=Intent(this,MainActivity2::class.java)
                    startActivity(intent)
        }
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