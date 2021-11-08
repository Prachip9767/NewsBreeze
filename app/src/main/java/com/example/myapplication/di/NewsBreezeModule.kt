package com.example.myapplication.di

import com.example.myapplication.remote.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NewsBreezeModule {

    //BaseUrl :- https://newsapi.org/v2/top-headlines?country=us&apiKey=cb048cd738504d8e9b073176ba23ddae
    private const val BASE_URL = "https://newsapi.org/"

    @Provides
    fun provideAPIService():ApiClient{
        val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return builder.create(ApiClient::class.java)
    }

}