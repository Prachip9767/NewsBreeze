package com.example.myapplication.remote.database;

import androidx.room.Database;

@androidx.room.Database(entities = {com.example.myapplication.remote.database.NewsBreezeModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/remote/database/NewsBreezedatabase;", "", "()V", "getResponseFromDao", "Lcom/example/myapplication/remote/database/NewsBreezeDao;", "app_debug"})
public abstract class NewsBreezedatabase {
    
    public NewsBreezedatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myapplication.remote.database.NewsBreezeDao getResponseFromDao();
}