package com.example.myapplication.remote.database;

import androidx.room.RoomDatabase;
import com.example.myapplication.remote.response.Article;
import java.lang.Class;
import java.lang.Override;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsBreezeDao_Impl implements NewsBreezeDao {
  private final RoomDatabase __db;

  public NewsBreezeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public void getDataFRomAPI(final List<Article> article) {
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
