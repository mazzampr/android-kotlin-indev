package com.example.cobapertama.latihanRetrofit

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R
import com.example.cobapertama.TodosItem

class TodoRetrofitViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val checkBox = itemView.findViewById<CheckBox>(R.id.checkBox)


}