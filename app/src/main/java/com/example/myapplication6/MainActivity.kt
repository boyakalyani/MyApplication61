package com.example.myapplication6

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val tag ="MainActivity 1"
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag,"on create")

        button=findViewById(R.id.button_id)
        button.setOnClickListener(){
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag,"on start")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag,"on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag,"on pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag,"on stop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(tag,"on restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag,"on Destroy")
    }
}