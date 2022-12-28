package com.example.activity_fragment_lifecycle
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.*

class BlankFragment2 : Fragment(R.layout.fragment_blank2)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        Log.d("Fragment----2", "onViewCreated")
    }

    override fun onAttach(context: Context)
    {
        super.onAttach(context)
        Log.d("Fragment----2", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        Log.d("Fragment----2", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment----2", "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Fragment----2", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment----2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment----2", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment----2", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment----2", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Fragment----2", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment----2", "onDestroyView")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment----2", "onDestroy")
    }

}
