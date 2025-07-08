package com.example.moviebrowser.data.network

import com.example.moviebrowser.data.model.Movie

object FakeMovieApi {
    fun getMovies(): List<Movie> = listOf(
        Movie("პირველი ფილმი", "ეს არის პირველი ფილმის მოკლე აღწერა."),
        Movie("მეორე ფილმი", "ეს არის მეორე ფილმის მოკლე აღწერა."),
        Movie("მესამე ფილმი", "ეს არის მესამე ფილმის მოკლე აღწერა.")
    )
}
