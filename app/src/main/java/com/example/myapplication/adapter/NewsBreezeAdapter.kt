package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemLayoutBinding
import com.example.myapplication.remote.response.Article

class NewsBreezeAdapter (
    private val articlesList: List<Article>
) : RecyclerView.Adapter<NewsBreezeAdapter.NewsBreezeViewHolder>() {

    //viewHolder
    class NewsBreezeViewHolder(private val itemLayoutBinding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(itemLayoutBinding.root) {
        fun onBind(article: Article) {
            itemLayoutBinding.article = article
            Glide.with(itemLayoutBinding.ivImage).load(article.urlToImage)
                .into(itemLayoutBinding.ivImage)
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
        val article = articlesList[position]
        holder.onBind(article)
    }

    override fun getItemCount(): Int {
        return articlesList.size
    }

}