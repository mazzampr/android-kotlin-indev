package com.example.cobapertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        // actionbar
        val actionBar = supportActionBar
        // set actionbar title
        actionBar!!.title = "Detail Page"
        // set back button
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}