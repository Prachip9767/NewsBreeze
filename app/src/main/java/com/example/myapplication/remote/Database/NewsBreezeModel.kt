package com.example.myapplication.remote.Database

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "newsBreeze_db")
data class NewsBreezeModel(@ColumnInfo(name = "date")
) {

}