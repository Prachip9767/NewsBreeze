package com.example.myapplication.remote.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.myapplication.remote.response.Article


@Dao
interface NewsBreezeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun getDataFRomAPI(article: List<Article>)
}