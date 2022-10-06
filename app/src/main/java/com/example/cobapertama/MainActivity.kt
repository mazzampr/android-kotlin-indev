package com.example.cobapertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val content = assets
            .open("products.json")
            .bufferedReader()
            .use {it.readText()}

        val pagingData = Gson().fromJson(content, Paging::class.java)

        Log.d("JSON", content)
        //Log.d("JSON-PagingData", pagingData.total?.toString().orEmpty())
        Log.d("JSON-PagingData2", pagingData.products?.get(0)?.title.toString())
    }
}