package com.example.myapplication.repo

import com.example.myapplication.remote.ApiClient
import com.example.myapplication.remote.response.Article
import javax.inject.Inject

class Repository @Inject constructor(private val apiClient: ApiClient) {
    suspend fun getResponse():List<Article>{
        return apiClient.getApiResponse().articles
    }
}