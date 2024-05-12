package com.example.gym

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class home : AppCompatActivity() {

    private lateinit var button: Button
    private  lateinit var button2: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)



        button=findViewById(R.id.button)

        button.setOnClickListener {
            ButtonClick(it)
        }

        button2=findViewById(R.id.button2)

        button2.setOnClickListener {
            ButtonClick1(it)
        }

}
    fun ButtonClick(view: View) {
        val intent = Intent(this, exercise::class.java)

        startActivity(intent)
        finish()
    }

    fun ButtonClick1(view: View) {
        val intent = Intent(this, Profile::class.java)

        startActivity(intent)
        finish()
    }




}

