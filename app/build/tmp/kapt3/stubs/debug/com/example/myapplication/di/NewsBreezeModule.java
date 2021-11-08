package com.example.myapplication.di;

import com.example.myapplication.remote.ApiClient;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/di/NewsBreezeModule;", "", "()V", "BASE_URL", "", "provideAPIService", "Lcom/example/myapplication/remote/ApiClient;", "app_debug"})
@dagger.Module()
public final class NewsBreezeModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.myapplication.di.NewsBreezeModule INSTANCE = null;
    private static final java.lang.String BASE_URL = "https://newsapi.org/";
    
    private NewsBreezeModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.myapplication.remote.ApiClient provideAPIService() {
        return null;
    }
}