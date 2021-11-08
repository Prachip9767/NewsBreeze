package com.example.myapplication.remote.database

import androidx.room.Database

@Database(entities = [NewsBreezeModel::class],version = 1)
abstract class NewsBreezedatabase {
    abstract fun getResponseFromDao():NewsBreezeDao
}