package com.pabcl.favoritemovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.pabcl.favoritemovie.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
    private val binding : ActivityDetailBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()
    }

    private fun setData() {
        binding.apply{
            val movies = intent.getParcelableExtra<Movies>(EXTRA_DETAIL)

            tvMovieName.text = movies?.name
            tvGenre.text = movies?.genre
            tvYear.text = movies?.year
            tvDetail.text = movies?.detail


            Glide.with(this@DetailActivity)
                .load(movies?.photo)
                .apply(RequestOptions())
                .into(ivMovie)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }

}