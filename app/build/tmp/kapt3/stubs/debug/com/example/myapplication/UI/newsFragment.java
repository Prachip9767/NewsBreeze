package com.example.myapplication.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.myapplication.adapter.NewsBreezeAdapter;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentNewsBinding;
import com.example.myapplication.viewModels.ViewModels;
import com.example.myapplication.remote.response.Article;
import com.example.myapplication.remote.response.OnItemClicked;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006*"}, d2 = {"Lcom/example/myapplication/ui/newsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/myapplication/remote/response/OnItemClicked;", "()V", "articleList", "", "Lcom/example/myapplication/remote/response/Article;", "getArticleList", "()Ljava/util/List;", "setArticleList", "(Ljava/util/List;)V", "newsBinding", "Lcom/example/myapplication/databinding/FragmentNewsBinding;", "getNewsBinding", "()Lcom/example/myapplication/databinding/FragmentNewsBinding;", "setNewsBinding", "(Lcom/example/myapplication/databinding/FragmentNewsBinding;)V", "newsBreezeAdapter", "Lcom/example/myapplication/adapter/NewsBreezeAdapter;", "getNewsBreezeAdapter", "()Lcom/example/myapplication/adapter/NewsBreezeAdapter;", "setNewsBreezeAdapter", "(Lcom/example/myapplication/adapter/NewsBreezeAdapter;)V", "viewModelApp", "Lcom/example/myapplication/viewModels/ViewModels;", "getViewModelApp", "()Lcom/example/myapplication/viewModels/ViewModels;", "viewModelApp$delegate", "Lkotlin/Lazy;", "OnItemClicked", "", "article", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
public final class newsFragment extends androidx.fragment.app.Fragment implements com.example.myapplication.remote.response.OnItemClicked {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.myapplication.remote.response.Article> articleList;
    public com.example.myapplication.databinding.FragmentNewsBinding newsBinding;
    public com.example.myapplication.adapter.NewsBreezeAdapter newsBreezeAdapter;
    private final kotlin.Lazy viewModelApp$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public newsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.myapplication.remote.response.Article> getArticleList() {
        return null;
    }
    
    public final void setArticleList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.remote.response.Article> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.databinding.FragmentNewsBinding getNewsBinding() {
        return null;
    }
    
    public final void setNewsBinding(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.databinding.FragmentNewsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.adapter.NewsBreezeAdapter getNewsBreezeAdapter() {
        return null;
    }
    
    public final void setNewsBreezeAdapter(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.adapter.NewsBreezeAdapter p0) {
    }
    
    private final com.example.myapplication.viewModels.ViewModels getViewModelApp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void OnItemClicked(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.remote.response.Article article) {
    }
}