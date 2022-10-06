package com.example.cobapertama

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class IntentImplicit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_implicit)

        val btnDial = findViewById<Button>(R.id.button_dial)
        val btnGoogle = findViewById<Button>(R.id.button_google)
        val btnKamera = findViewById<Button>(R.id.button_kamera)
        val btnPeta = findViewById<Button>(R.id.button_peta)
        val etMessage = findViewById<EditText>(R.id.et_message)
        val etPhone = findViewById<EditText>(R.id.et_phone)
        val btnKirim = findViewById<Button>(R.id.buttonKirim)

        btnDial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }

        btnGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intent)

        }

        btnKamera.setOnClickListener {
            val intent = Intent("android.media.action.IMAGE_CAPTURE")
            startActivity(intent)
        }

        btnPeta.setOnClickListener {
            val gmmIntentUri = Uri.parse("https://maps.app.goo.gl/wwwv1bvTHxRKjgD99")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            startActivity(mapIntent)
        }

        btnKirim.setOnClickListener {
            val p = etPhone.text.toString()
            val message = etMessage.text.toString()

            val sendIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://api.whatsapp.com/send?phone=$p&text=$message"))
            startActivity(sendIntent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.exercise_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.setting_action) {
            startActivity(Intent(Settings.ACTION_SETTINGS))
        } else {
            startActivity(Intent(this@IntentImplicit, MainMenu3::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}