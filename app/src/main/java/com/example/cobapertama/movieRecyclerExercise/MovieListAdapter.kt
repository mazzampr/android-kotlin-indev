package com.example.cobapertama.movieRecyclerExercise

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R

class MovieListAdapter(private val eventHandling: (DataMovie) -> Unit) :
    RecyclerView.Adapter<MovieListViewHolder>() {
    private val dataset = arrayListOf<DataMovie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        return MovieListViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_movie_item_grid, parent, false), eventHandling
        )
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        holder.onBindView(dataset[position])
    }

    override fun getItemCount(): Int = dataset.size

    fun setNewItem(newDataset: ArrayList<DataMovie>) {
        dataset.clear()
        dataset.addAll(newDataset)
        this.notifyDataSetChanged()
    }


}