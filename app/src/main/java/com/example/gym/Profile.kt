package com.example.gym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gym.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {


    private lateinit var db:NoteDatabaseHelper
    private lateinit var notesAdapter: NotesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        blinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(blinding.root)

        db= NoteDatabaseHelper(this)
        notesAdapter= NotesAdapter(db.getAllNotes(),this)

        blinding.notesRecyclerView.layoutManager=LinearLayoutManager(this)
        blinding.notesRecyclerView.adapter=notesAdapter

        blinding.addbutton.setOnClickListener{
            val intent=Intent(this,AddNoteActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        notesAdapter.refreshData(db.getAllNotes())

    }
}


