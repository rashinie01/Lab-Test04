package com.example.gym


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.gym.databinding.ActivityAddNoteBinding
import com.example.gym.databinding.ActivityMainBinding

class AddNoteActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityAddNoteBinding
    private lateinit var db: NoteDatabaseHelper
    private lateinit var button3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button3 = findViewById(R.id.button3)

        button3.setOnClickListener {
            ButtonClick(it)
        }

        db = NoteDatabaseHelper(this)

        binding.savebutton.setOnClickListener{
            val title = binding.addNote.text.toString()
            val content = binding.contentEditText.text.toString()
            val note = Note(0,title,content)
            db.insertNote(note)
            finish()
            Toast.makeText(this, "Note Saved", Toast.LENGTH_LONG).show()
        }

}
    fun ButtonClick(view: View) {
        val intent = Intent(this, Profile::class.java)

        startActivity(intent)
        finish()
    }

}
