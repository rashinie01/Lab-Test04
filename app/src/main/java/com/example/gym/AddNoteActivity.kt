package com.example.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.gym.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {


    private lateinit var db:NoteDatabase
    private lateinit var viewModel: MainActvityData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add_note)
        val recyclerView: RecyclerView = findViewById(R.id.rvTodoList)
        val repository = NoteRepository(NoteDatabase.getInstance(this))

        db= NoteDatabase(this)

        binding.savebutton.setOnClickListener {
            val title=binding.titleEdittext.text.toString()
            val content=binding.contentEditText.text.toString()
            val note =Note(0,title,content)
            db.insertNote(note)
            finish()
            Toast.makeText(this,"Note saved",Toast.LENGTH_SHORT).show()
        }
    }


}
