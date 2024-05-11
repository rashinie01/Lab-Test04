package com.example.gym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class home : AppCompatActivity() {

    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        button=findViewById(R.id.button)

        button.setOnClickListener {
            ButtonClick(it)

        }
}
    fun ButtonClick(view: View) {
        val intent = Intent(this, exercise::class.java)

        startActivity(intent)
        finish()
    }
}