package com.example.myapplication.viewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.example.myapplication.repo.Repository;
import com.example.myapplication.remote.response.Article;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lcom/example/myapplication/viewModels/ViewModels;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/myapplication/repo/Repository;", "(Lcom/example/myapplication/repo/Repository;)V", "getRepository", "()Lcom/example/myapplication/repo/Repository;", "setRepository", "getDataFromApi", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/myapplication/remote/response/Article;", "app_debug"})
public final class ViewModels extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.myapplication.repo.Repository repository;
    
    @javax.inject.Inject()
    public ViewModels(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.repo.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.repo.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.repo.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.remote.response.Article>> getDataFromApi() {
        return null;
    }
}