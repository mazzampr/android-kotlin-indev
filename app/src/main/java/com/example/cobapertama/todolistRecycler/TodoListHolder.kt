package com.example.cobapertama.todolistRecycler

import android.view.View
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R
import com.example.cobapertama.TodosItem

class TodoListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val cb = itemView.findViewById<CheckBox>(R.id.checkBox)

    fun onBindView(todos: TodosItem) {
        cb.text = todos.todo.toString()
    }
}