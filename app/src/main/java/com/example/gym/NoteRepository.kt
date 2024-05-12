package com.example.gym

class NoteRepository
    (  private val db:NoteDatabase
)

{
    suspend fun insert(note:Note)=db.getNoteDao().insert(note)
    suspend fun delete(note:Note)=db.getNoteDao().delete(note)


    fun getAllNoteItems():List<Note> =db.getNoteDao().getAllNoteItems()

}


