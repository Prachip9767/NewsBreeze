package com.example.myapplication.remote.database

import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit
class Network {
    private val BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=cb048cd738504d8e9b073176ba23ddae"

    fun getRetrofit(): Retrofit? {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient.Builder().build())
            .build()
    }
}