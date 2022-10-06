package com.example.cobapertama.movieRecyclerExercise

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cobapertama.R


class TesRecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tes_recycler_view)

        val listOfMovies = arrayListOf<DataMovie>()
        listOfMovies.add(DataMovie("Fall", "For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights", "https://www.themoviedb.org/t/p/original/spCAxD99U1A6jsiePFoqdEcY0dG.jpg"))
        listOfMovies.add(DataMovie("Orphan: First Kill","After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.", "https://www.themoviedb.org/t/p/original/wSqAXL1EHVJ3MOnJzMhUngc8gFs.jpg"))
        listOfMovies.add(DataMovie("Pinocchio","A wooden puppet embarks on a thrilling adventure to become a real boy.","https://www.themoviedb.org/t/p/original/g8sclIV4gj1TZqUpnL82hKOTK3B.jpg"))
        listOfMovies.add(DataMovie("Beast","A recently widowed man and his two teenage daughters travel to a game reserve in South Africa. However, their journey of healing soon turns into a fight for survival when a bloodthirsty lion starts to stalk them.","https://www.themoviedb.org/t/p/original/iRV0IB5xQeOymuGGUBarTecQVAl.jpg"))
        listOfMovies.add(DataMovie("Samaritan","Thirteen year old Sam Cleary  suspects that his mysteriously reclusive neighbor Mr. Smith is actually the legendary vigilante Samaritan, who was reported dead 20 years ago. With crime on the rise and the city on the brink of chaos, Sam makes it his mission to coax his neighbor out of hiding to save the city from ruin.","https://www.themoviedb.org/t/p/original/vwq5iboxYoaSpOmEQrhq9tHicq7.jpg"))
        listOfMovies.add(DataMovie("You","A dangerously charming, intensely obsessive young man goes to extreme measures to insert himself into the lives of those he is transfixed by.","https://www.themoviedb.org/t/p/original/yxIdKGEjagaLs5kMjw92kAHmopH.jpg"))

        Log.d("BERHENTIII", "Terdeteksi")
        val rvMovie = findViewById<RecyclerView>(R.id.rv_movie)
        val rvMovieAdapter = MovieListAdapter {
            Toast.makeText(this, "Clicked ${it.title}", Toast.LENGTH_SHORT).show()
        }
        Log.d("JSON-TodoList", listOfMovies.toString())

        // Set Grid Layout
        val layoutManager = GridLayoutManager(this, 2)
        rvMovie.layoutManager = layoutManager
        rvMovie.adapter = rvMovieAdapter
        rvMovieAdapter.setNewItem(listOfMovies)
    }
}
