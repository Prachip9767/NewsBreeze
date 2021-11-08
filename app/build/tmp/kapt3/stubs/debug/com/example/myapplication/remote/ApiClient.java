package com.example.myapplication.remote;

import com.example.myapplication.remote.response.ResponseDTO;
import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/remote/ApiClient;", "", "getApiResponse", "Lcom/example/myapplication/remote/response/ResponseDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiClient {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v2/top-headlines?country=us&apiKey=cb048cd738504d8e9b073176ba23ddae")
    public abstract java.lang.Object getApiResponse(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.myapplication.remote.response.ResponseDTO> continuation);
}