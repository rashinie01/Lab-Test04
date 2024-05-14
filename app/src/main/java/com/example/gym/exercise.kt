package com.example.gym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class exercise : AppCompatActivity() {

    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)


        imageView = findViewById(R.id.imageView)

        imageView.setOnClickListener {
            ButtonClick1(it)
        }

    }


    fun ButtonClick1(view: View) {
        val intent = Intent(this, home::class.java)

        startActivity(intent)
        finish()
    }
}