package com.example.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Profile : AppCompatActivity() {

    lateinit var btnDelete: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        btnDelete=findViewById(R.id.btnDelete)

        btnDelete.setOnClickListener{
            delete()
        }


}
fun delete(){
    Toast.makeText(this, "Delete Your Profile", Toast.LENGTH_LONG).show()
}
}
