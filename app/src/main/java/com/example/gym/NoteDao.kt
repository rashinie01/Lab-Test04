package com.example.gym

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    suspend fun insert(note:Note)

    @Delete
    suspend fun delete(note: Note)

    @Query("SELECT* FROM Note")
    fun getAllNoteItems():List<Note>

    @Query("SELECT * FROM Note WHERE id=:id")
    fun getOne(id:Int):Note
}