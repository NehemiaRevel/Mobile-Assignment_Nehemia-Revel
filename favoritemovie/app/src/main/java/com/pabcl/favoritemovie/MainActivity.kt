package com.pabcl.favoritemovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.pabcl.favoritemovie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding : ActivityMainBinding by viewBinding()
    private val list : ArrayList<Movies> = arrayListOf()
    private lateinit var listMovieAdapter: ListMovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvMovies.setHasFixedSize(true)
        list.addAll(MoviesData.listData)

        showRecyclerVewList()
    }

    private fun showRecyclerVewList() {
        binding.apply {
            rvMovies.layoutManager = LinearLayoutManager(this@MainActivity)
            listMovieAdapter = ListMovieAdapter(list)
            rvMovies.adapter = listMovieAdapter
        }
    }
}