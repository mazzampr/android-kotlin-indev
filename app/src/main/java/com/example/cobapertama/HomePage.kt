package com.example.cobapertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        Log.d("ONCREATE", "Sedang mencoba ONCREATE")

        // actionbar
        val actionBar = supportActionBar
        // set actionbar title
        actionBar!!.title = "Home Page"

        val btnDetails = findViewById<Button>(R.id.btn_details)

        btnDetails.setOnClickListener {
            val goToToast = Intent(this@HomePage, DetailPage::class.java)
            startActivity(goToToast)
        }

    }

    // LOGCAT + Lifecycle
    override fun onStart() {
        super.onStart()
        Log.d("ONSTART", "Sedang mencoba ONSTART")
    }
    override fun onStop() {
        super.onStop()
        Log.d("ONSTOP", "Sedang mencoba ONSTOP")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ONRESUME", "Sedang mencoba ONRESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ONPAUSE", "Sedang mencoba ONPAUSE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ONDESTROY", "Sedang mencoba ONDESTROY")
    }

}