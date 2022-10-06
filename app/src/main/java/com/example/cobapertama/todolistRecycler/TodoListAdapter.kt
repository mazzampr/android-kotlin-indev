package com.example.cobapertama.todolistRecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R
import com.example.cobapertama.TodosItem

class TodoListAdapter(): RecyclerView.Adapter<TodoListHolder>() {

    private val data = arrayListOf<TodosItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListHolder {
        return TodoListHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_todo, parent, false)
        )
    }

    override fun onBindViewHolder(holder: TodoListHolder, position: Int) {
        holder.onBindView(data[position])
    }

    override fun getItemCount(): Int = data.size

    fun setNewItem(newData: ArrayList<TodosItem>) {
        data.clear()
        data.addAll(newData)
        this.notifyDataSetChanged()
    }

}