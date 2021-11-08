package com.example.myapplication.remote.response

data class ResponseDTO(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)