package com.example.cobapertama.todolistRecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.*
import com.google.gson.Gson

class TodoListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        val content = assets
            .open("todos.json")
            .bufferedReader()
            .use {it.readText()}

        val pagingData = Gson().fromJson(content, PagingToDo::class.java)


        val todoAdapter = TodoListAdapter()
        todoAdapter.setNewItem(pagingData.todos.orEmpty() as ArrayList<TodosItem>)

        //val todoList = arrayListOf<TodosItem>()

//        for(data in pagingData.todos.orEmpty()) {
//            todoList.add(TodosItem(data?.todo, data?.id, data?.completed, data?.userId))
//        }
//
//
        val rvTodos = findViewById<RecyclerView>(R.id.rv_todo)
        rvTodos.adapter = todoAdapter

    }
}