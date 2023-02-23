package com.example.myapplication6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
   private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.i("kalyani","on create")

        btn=findViewById(R.id.button_id2)
        btn.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ijitha","on start")
    }

    override fun onResume() {
        super.onResume()
        Log.i("jk","on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("jaji","on pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("mom","on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("dad","on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("bro","on destroy")
    }
}
