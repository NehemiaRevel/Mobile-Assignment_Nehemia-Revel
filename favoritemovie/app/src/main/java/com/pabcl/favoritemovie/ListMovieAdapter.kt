package com.pabcl.favoritemovie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.pabcl.favoritemovie.databinding.ItemRowMovieBinding

class ListMovieAdapter(private val list : ArrayList<Movies>) :
    RecyclerView.Adapter<ListMovieAdapter.ListViewHolder>() {

    inner class ListViewHolder(private val binding: ItemRowMovieBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(Movies: Movies){
            with(binding){
                tvMovieName.text = Movies.name
                tvMovieDetail.text = Movies.detail
                Glide.with(itemView.context)
                    .load(Movies.photo)
                    .apply(RequestOptions().override(260,260))
                    .into(ivMovie)
                itemView.setOnClickListener{
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_DETAIL, Movies)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemRowMovieBinding.inflate((LayoutInflater.from(parent.context)), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = list[position]

        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}