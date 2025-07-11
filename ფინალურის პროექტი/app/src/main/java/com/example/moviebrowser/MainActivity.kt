package com.example.moviebrowser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moviebrowser.fragments.MovieListFragment
import com.example.moviebrowser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, MovieListFragment())
            .commit()
    }
}
