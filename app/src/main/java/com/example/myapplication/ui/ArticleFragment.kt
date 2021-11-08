package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentResultListener
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentArticleBinding
import com.example.myapplication.databinding.FragmentNewsBinding

class ArticleFragment : Fragment(R.layout.fragment_article) {
    private lateinit var newsBinding: FragmentArticleBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        getData()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_News, container, false)
        return newsBinding.root
    }


    private fun getData() {
        parentFragmentManager.setFragmentResultListener(
            "article", this, FragmentResultListener() { s: String, bundle: Bundle ->
                val author = bundle.getString("author")
                newsBinding.tvAuthor.text = "Author :- $author"
                val content = bundle.getString("content")
                newsBinding.tvContent.text = "Content :- $content"
                val description = bundle.getString("description")
                newsBinding.tvDescription.text = "Description :- $description"
                val publishedAt = bundle.getString("publishedAt")
                newsBinding.tvPublishedAt.text = "Published At :- $publishedAt"
                val title = bundle.getString("title")
                newsBinding.tvTitle.text = "Title :- $title"
                val urlToImage = bundle.getString("urlToImage")
                Glide.with(newsBinding.ivArticleImage).load(urlToImage)
                    .into(newsBinding.ivArticleImage)
            }
        )
    }

}