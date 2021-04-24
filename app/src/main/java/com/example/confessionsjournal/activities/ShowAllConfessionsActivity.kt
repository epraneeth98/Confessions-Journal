package com.example.confessionsjournal.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.confessionsjournal.R
import com.example.confessionsjournal.activities.adapters.ConfessionsListAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ShowAllConfessionsActivity : AppCompatActivity(), View.OnClickListener {

    private val confessionsList = ArrayList<String>()
    private val ACTION_NEW_CONFESSION: Int = 101
    private lateinit var confessionsListAdapter: ConfessionsListAdapter
    private lateinit var floatingActionButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_confessions)

        init()
    }

    private fun init() {
        supportActionBar?.hide()
        confessionsListAdapter = ConfessionsListAdapter(applicationContext, confessionsList)
        floatingActionButton = findViewById(R.id.fab_add_confession)
        val recyclerView: RecyclerView = findViewById(R.id.show_confessions_recycler_view)
        val linearLayoutManager = LinearLayoutManager(applicationContext)

        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = confessionsListAdapter
        prepareMovieData()

        floatingActionButton.setOnClickListener(this)
    }

    private fun prepareMovieData() {

        val s: String = "I'm a row in the recycler View. I just want to wish you to have a happy day."
        confessionsList.add("        $s")
        confessionsList.add("        $s")
        confessionsList.add("        $s")
        confessionsList.add("        $s")
        confessionsList.add("        $s")
        confessionsList.add("        $s")
        confessionsList.add("        $s")
        confessionsList.add("        $s")
    }

    override fun onClick(v: View) {
        if(v.id == floatingActionButton.id){
            createNewJournal()
        }
    }

    private fun createNewJournal() {
        val intent = Intent(this, AddNewConfessionActivity::class.java)
        startActivityForResult(intent, ACTION_NEW_CONFESSION)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== RESULT_OK && requestCode==ACTION_NEW_CONFESSION){

        }else{
            Toast.makeText(this, "Unable to add new Confession", Toast.LENGTH_SHORT)
        }
    }
}