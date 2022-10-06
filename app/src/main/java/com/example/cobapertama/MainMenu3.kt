package com.example.cobapertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu3)

        val btnDaftar = findViewById<Button>(R.id.button_signin)
        val btnSignUp = findViewById<Button>(R.id.button_signup)

        btnDaftar.setOnClickListener {
            val goToToast = Intent(this@MainMenu3, MainMenu4Toast::class.java)
            startActivity(goToToast)
        }

        btnSignUp.apply {
            setOnClickListener {
                val goToToast = Intent(this@MainMenu3, DetailPage::class.java)
                startActivity(goToToast)
            }
        }

    }
}