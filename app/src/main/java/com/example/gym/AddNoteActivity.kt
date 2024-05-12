package com.example.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.gym.databinding.ActivityAddNoteBinding

class AddNoteActivity : AppCompatActivity() {


    private lateinit var viewModel: MainActvityData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add_note)

    var savebutton: ImageView =findViewById(R.id.savebutton)
    var  titleEdittext:EditText=findViewById(R.id.titleEdittext)
    var contentEditText: EditText=findViewById(R.id.contentEditText)


        }
    }

