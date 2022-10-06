package com.example.cobapertama.movieRecyclerExercise

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R
import com.squareup.picasso.Picasso

class MovieListViewHolder(itemView: View, val eventHandling: (DataMovie) -> Unit) : RecyclerView.ViewHolder(itemView) {
    val tv_title = itemView.findViewById<TextView>(R.id.tv_item_title2)
    val tv_cover = itemView.findViewById<ImageView>(R.id.iv_imgCover2)
//    val tv_desc = itemView.findViewById<TextView>(R.id.item_movie_desc)

    fun onBindView(movie: DataMovie) {
        tv_title.text = movie.title
//        tv_desc.text = movie.desc

//        tv_cover.setImageDrawable(
//            ContextCompat.getDrawable(
//                itemView.context,
//                R.drawable.got_poster
//            )
//        )
        Picasso
            .get()
            .load(movie.imgCover)
            .into(tv_cover)
        itemView.setOnClickListener { eventHandling(movie) }
    }
}