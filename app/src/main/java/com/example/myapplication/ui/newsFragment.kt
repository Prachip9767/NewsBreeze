package com.example.myapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.NewsBreezeAdapter
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentNewsBinding
import com.example.myapplication.viewModels.ViewModels

import com.example.myapplication.remote.response.Article
import com.example.myapplication.remote.response.OnItemClicked

class newsFragment : Fragment(),OnItemClicked {
    var articleList = mutableListOf<Article>()
    lateinit var newsBinding: FragmentNewsBinding
    lateinit var newsBreezeAdapter: NewsBreezeAdapter
    private val viewModelApp : ViewModels by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        newsBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_news,container,false)
        return newsBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsBinding.apply {
            newsBreezeAdapter = NewsBreezeAdapter(articleList)
            recyclerView.layoutManager = LinearLayoutManager(context)
            recyclerView.adapter = newsBreezeAdapter
        }

        viewModelApp.getDataFromApi().observe(viewLifecycleOwner, Observer {
            articleList.clear()
            articleList.addAll(it)
            newsBreezeAdapter.notifyDataSetChanged()
        })
    }

    override fun OnItemClicked(article: Article) {
        val bundle = Bundle()
        bundle.putString("author",article.author)
        bundle.putString("content",article.content)
        bundle.putString("description",article.description)
        bundle.putString("publishedAt",article.publishedAt)
        bundle.putString("source", article.source.toString())
        bundle.putString("title",article.title)
        bundle.putString("url",article.url)
        bundle.putString("urlToImage",article.urlToImage)
        parentFragmentManager.setFragmentResult("article",bundle)

        //navigating
        Navigation.findNavController(requireView()).navigate(R.id.action_NewsFragment_to_articleFragment)
    }
}