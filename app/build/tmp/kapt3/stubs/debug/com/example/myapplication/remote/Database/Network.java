package com.example.myapplication.remote.database;

import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Retrofit;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/remote/database/Network;", "", "()V", "BASE_URL", "", "getRetrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class Network {
    private final java.lang.String BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&apiKey=cb048cd738504d8e9b073176ba23ddae";
    
    public Network() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
}