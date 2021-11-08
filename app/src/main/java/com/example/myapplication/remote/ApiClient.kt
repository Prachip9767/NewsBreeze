package com.example.myapplication.remote

import com.example.myapplication.remote.response.ResponseDTO
import retrofit2.http.GET

interface ApiClient {

    //https://newsapi.org/v2/top-headlines?country=us&apiKey=cb048cd738504d8e9b073176ba23ddae
    @GET("v2/top-headlines?country=us&apiKey=cb048cd738504d8e9b073176ba23ddae")
    suspend fun getApiResponse():ResponseDTO
}
