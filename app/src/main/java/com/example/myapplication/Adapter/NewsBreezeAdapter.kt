package com.example.myapplication.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemLayoutBinding
import com.example.myapplication.remote.response.Article

class NewsBreezeAdapter (
    private val articleList: List<Article>
) : RecyclerView.Adapter<NewsBreezeAdapter.NewsBreezeViewHolder>() {

    //viewHolder
    class NewsBreezeViewHolder(private val itemLayoutBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(itemLayoutBinding.root) {
        fun onBind(article: Article) {
            itemLayoutBinding.article = article
            Glide.with(itemLayoutBinding.ivImageArticle).load(article.urlToImage)
                .into(itemLayoutBinding.ivImageArticle)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsBreezeViewHolder {
        val itemLayoutBinding: ItemLayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_layout, parent, false
        )
        return NewsBreezeViewHolder(itemLayoutBinding)
    }

    override fun onBindViewHolder(holder: NewsBreezeViewHolder, position: Int) {
        var article = articleList[position]
        holder.onBind(article)
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

}