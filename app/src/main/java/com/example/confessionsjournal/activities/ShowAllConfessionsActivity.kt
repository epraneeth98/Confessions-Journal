package com.example.confessionsjournal.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.confessionsjournal.R
import com.example.confessionsjournal.activities.adapters.ConfessionsListAdapter

class ShowAllConfessionsActivity : AppCompatActivity() {

    private val confessionsList = ArrayList<String>()
    private lateinit var confessionsListAdapter: ConfessionsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_confessions)

        init()
    }

    private fun init() {
        supportActionBar?.hide()
        val recyclerView: RecyclerView = findViewById(R.id.show_confessions_recycler_view)
        confessionsListAdapter = ConfessionsListAdapter(applicationContext, confessionsList)
        val linearLayoutManager = LinearLayoutManager(applicationContext)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = confessionsListAdapter
        prepareMovieData()
    }

    private fun prepareMovieData() {

        val s: String = "        I'm a row in the recycler View. I just want to wish you to have a happy day."
        confessionsList.add(s)
        confessionsList.add(s)
        confessionsList.add(s)
        confessionsList.add(s)
        confessionsList.add(s)
        confessionsList.add(s)
        confessionsList.add(s)

    }
}