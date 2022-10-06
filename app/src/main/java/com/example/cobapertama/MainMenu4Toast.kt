package com.example.cobapertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainMenu4Toast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu4_toast)

        findViewById<Button>(R.id.button_klik).text = "Klik Saya"
        findViewById<Button>(R.id.button_klik).setOnClickListener {
            Toast.makeText(this@MainMenu4Toast, "Haloo semuaa", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.button_klik).setOnLongClickListener {
            Toast.makeText(this@MainMenu4Toast, "Text Berubah", Toast.LENGTH_SHORT).show()
            true
        }
    }

}


