package com.example.myapplication.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.myapplication.repo.Repository
import com.example.myapplication.remote.response.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
@HiltViewModel
 class ViewModels @Inject constructor(var repository: Repository):ViewModel(){
     fun getDataFromApi():LiveData<List<Article>>{
         return liveData(Dispatchers.IO) {
             emit(repository.getResponse())
         }
     }
}