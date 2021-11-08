package com.example.myapplication.UI;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.myapplication.Adapter.NewsBreezeAdapter;
import com.example.myapplication.R;
import com.example.myapplication.ViewModels.ViewModels;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.remote.response.Article;

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/example/myapplication/UI/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "articleList", "", "Lcom/example/myapplication/remote/response/Article;", "getArticleList", "()Ljava/util/List;", "setArticleList", "(Ljava/util/List;)V", "homeBinding", "Lcom/example/myapplication/databinding/FragmentHomeBinding;", "getHomeBinding", "()Lcom/example/myapplication/databinding/FragmentHomeBinding;", "setHomeBinding", "(Lcom/example/myapplication/databinding/FragmentHomeBinding;)V", "newsBreezeAdapter", "Lcom/example/myapplication/Adapter/NewsBreezeAdapter;", "getNewsBreezeAdapter", "()Lcom/example/myapplication/Adapter/NewsBreezeAdapter;", "setNewsBreezeAdapter", "(Lcom/example/myapplication/Adapter/NewsBreezeAdapter;)V", "viewModelApp", "Lcom/example/myapplication/ViewModels/ViewModels;", "getViewModelApp", "()Lcom/example/myapplication/ViewModels/ViewModels;", "viewModelApp$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.myapplication.remote.response.Article> articleList;
    public com.example.myapplication.databinding.FragmentHomeBinding homeBinding;
    public com.example.myapplication.Adapter.NewsBreezeAdapter newsBreezeAdapter;
    private final kotlin.Lazy viewModelApp$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public HomeFragment() {
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
    public final com.example.myapplication.databinding.FragmentHomeBinding getHomeBinding() {
        return null;
    }
    
    public final void setHomeBinding(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.databinding.FragmentHomeBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myapplication.Adapter.NewsBreezeAdapter getNewsBreezeAdapter() {
        return null;
    }
    
    public final void setNewsBreezeAdapter(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.Adapter.NewsBreezeAdapter p0) {
    }
    
    private final com.example.myapplication.ViewModels.ViewModels getViewModelApp() {
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
}