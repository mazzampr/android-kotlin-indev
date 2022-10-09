package com.example.cobapertama.latihanRetrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R


class TodoRetrofitAdapter(): RecyclerView.Adapter<TodoRetrofitViewHolder>() {

    private val todoList: MutableList<TodosItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoRetrofitViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_todo, parent, false)
        return TodoRetrofitViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoRetrofitViewHolder, position: Int) {
        val data = todoList[position]
        holder.checkBox.text = data.todo
        holder.checkBox.isChecked = data.completed ?: false
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    fun setNewData(data: List<TodosItem>) {
        todoList.clear()
        todoList.addAll(data)
        this.notifyDataSetChanged()
    }
}