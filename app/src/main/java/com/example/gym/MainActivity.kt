package com.example.gym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnRegister=findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            ButtonClick(it)

        }
    }
    fun ButtonClick(view: View) {
        val intent = Intent(this, home::class.java)

        startActivity(intent)
        finish()
    }
}