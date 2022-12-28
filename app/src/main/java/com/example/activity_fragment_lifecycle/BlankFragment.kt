package com.example.activity_fragment_lifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.*

class BlankFragment : Fragment(R.layout.fragment_blank)
{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {

//             Toast.makeText(this@BlankFragment.requireActivity(), someInt+"<----->"+roll.toString(), Toast.LENGTH_SHORT).show()
//            var button=view.findViewById<Button>(R.id.btn2)
//            button.setOnClickListener { View ->
//                var intent = Intent (activity,MainActivity::class.java)
//                startActivity(intent)

        Log.d("Fragment----1", "onViewCreated")
        val button=view.findViewById<Button>(R.id.btn2)
        button.setOnClickListener{View->
            fragmentManager?.commit {
                val nextFragment=BlankFragment2()
                replace<BlankFragment2>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }

        val button3=view.findViewById<Button>(R.id.btn3)
        button3.setOnClickListener{View->
            val intent=Intent(this.context,MainActivity2::class.java)
            startActivity(intent)
            }
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        Log.d("Fragment----1", "onAttach")
    }

        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            Log.d("Fragment----1", "onCreate")
        }

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            Log.d("Fragment----1", "onCreateView")
            return super.onCreateView(inflater, container, savedInstanceState)
        }

        override fun onViewStateRestored(savedInstanceState: Bundle?) {
            super.onViewStateRestored(savedInstanceState)
            Log.d("Fragment----1", "onViewStateRestored")
        }

        override fun onStart() {
            super.onStart()
            Log.d("Fragment----1", "onStart")
        }

        override fun onResume() {
            super.onResume()
            Log.d("Fragment----1", "onResume")
        }

        override fun onPause() {
            super.onPause()
            Log.d("Fragment----1", "onPause")
        }

        override fun onStop() {
            super.onStop()
            Log.d("Fragment----1", "onStop")
        }

        override fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            Log.d("Fragment----1", "onSaveInstanceState")
        }

        override fun onDestroyView() {
            super.onDestroyView()
            Log.d("Fragment----1", "onDestroyView")
        }


        override fun onDestroy() {
            super.onDestroy()
            Log.d("Fragment----1", "onDestroy")
        }

}
