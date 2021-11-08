package com.example.myapplication.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.Adapter.NewsBreezeAdapter
import com.example.myapplication.R
import com.example.myapplication.ViewModels.ViewModels
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.remote.response.Article

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(R.layout.fragment_home) {
    var articleList = mutableListOf<Article>()
    lateinit var homeBinding: FragmentHomeBinding
    lateinit var newsBreezeAdapter: NewsBreezeAdapter
    private val viewModelApp : ViewModels by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        return homeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeBinding.apply {
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
}