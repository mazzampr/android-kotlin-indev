package com.example.cobapertama.latihanRetrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainTodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_todo)

        val coroutineExceptionHandler = CoroutineExceptionHandler{ _, throwable ->
            throwable.printStackTrace()
        }

        val rvTodos = findViewById<RecyclerView>(R.id.rv_todoRetrofit)

        val todos = listOf<TodosItem>(
            TodosItem(todo = "Halo dek", completed = true),
            TodosItem(todo = "Beli Buku"),
            TodosItem(todo = "Makan Bakso")
        )

//        rvTodos.adapter = TodoRetrofitAdapter().apply {
//            setNewData(todos)
//        }


        GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler) {
            val resp = retrofitService().getTodoList()
            if(resp.isSuccessful) {
                val newTodoData = resp.body()?.todos
                rvTodos.adapter = TodoRetrofitAdapter().apply {
                    setNewData(newTodoData.orEmpty())
                }
            }
        }

    }


    fun retrofitService(): APIService {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://dummyjson.com")
            .build()
            .create(APIService::class.java)
    }
}