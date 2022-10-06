package com.example.cobapertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class TestListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_list_view)

        val listOfFood = arrayListOf<String>(
            "Sate",
            "Bakso",
            "Nasi Goreng",
            "Nasi Rames",
            "Nasi Campur",
            "Ayam Goreng",
            "Ayam Palupi",
            "Rujak Cingur",
            "Rujak Buah",
            "Rujak Buah",
            "Rujak Buah",
            "Rujak Buah",
            "Rujak Buah",
        )
        val listItem  = findViewById<ListView>(R.id.list_view)
        val lvAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listOfFood
        )
        listItem.adapter = lvAdapter
        listItem.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, listOfFood[i], Toast.LENGTH_SHORT).show()
        }
    }
}