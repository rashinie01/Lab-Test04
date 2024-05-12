package com.example.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.gym.databinding.ActivityAddnoteBinding
import com.example.gym.databinding.ActivityProfileBinding

class Addnote : AppCompatActivity() {

    private lateinit var binding: ActivityAddnoteBinding
    private lateinit var db: NoteDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityAddnoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db= NoteDatabaseHelper(this)

        binding.savebutton.setOnClickListener{
            val title = binding.titleEdittext.text.toString()
            val content = binding.contentEditText.text.toString()
            val note=Note(0,title,content)
            db.insertNote(note)
            finish()
            Toast.makeText(this,"Note saved",Toast.LENGTH_SHORT).show()
        }


    }
}