package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ItemLayoutBinding;
import com.example.myapplication.remote.response.Article;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/myapplication/adapter/NewsBreezeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication/adapter/NewsBreezeAdapter$NewsBreezeViewHolder;", "articlesList", "", "Lcom/example/myapplication/remote/response/Article;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NewsBreezeViewHolder", "app_debug"})
public final class NewsBreezeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myapplication.adapter.NewsBreezeAdapter.NewsBreezeViewHolder> {
    private final java.util.List<com.example.myapplication.remote.response.Article> articlesList = null;
    
    public NewsBreezeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.myapplication.remote.response.Article> articlesList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myapplication.adapter.NewsBreezeAdapter.NewsBreezeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.adapter.NewsBreezeAdapter.NewsBreezeViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/myapplication/adapter/NewsBreezeAdapter$NewsBreezeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemLayoutBinding", "Lcom/example/myapplication/databinding/ItemLayoutBinding;", "(Lcom/example/myapplication/databinding/ItemLayoutBinding;)V", "onBind", "", "article", "Lcom/example/myapplication/remote/response/Article;", "app_debug"})
    public static final class NewsBreezeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.myapplication.databinding.ItemLayoutBinding itemLayoutBinding = null;
        
        public NewsBreezeViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.databinding.ItemLayoutBinding itemLayoutBinding) {
            super(null);
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.example.myapplication.remote.response.Article article) {
        }
    }
}