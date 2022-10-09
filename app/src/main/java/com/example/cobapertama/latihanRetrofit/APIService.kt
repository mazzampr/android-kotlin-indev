package com.example.cobapertama.latihanRetrofit

import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("/todos")
    suspend fun getTodoList(): Response<DataToDo>
}