package com.example.gym


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gym.databinding.ActivityProfileBinding
import androidx.recyclerview.widget.RecyclerView

class Profile : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private  lateinit var db: NoteDatabaseHelper
    private lateinit var TodoAdapter: TodoAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = NoteDatabaseHelper(this)
        TodoAdapter = TodoAdapter(db.getAllNotes(), this)

       binding.notesRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.notesRecyclerView.adapter = TodoAdapter



        binding.addButton.setOnClickListener{
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume(){
        super.onResume()
        TodoAdapter.refreshData(db.getAllNotes())
    }
}