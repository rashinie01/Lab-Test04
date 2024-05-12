package com.example.gym

import androidx.room.Entity

@Entity
data class Note(
    val id: String, val title:String, val content: String)
