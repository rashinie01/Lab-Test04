package com.example.gym

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase(){


    abstract fun getNoteDao():NoteDao

    companion object{
        @Volatile
        private var INSTANCE:NoteDatabase?=null

        fun getInstance(context:Context):NoteDatabase {
            synchronized(this) {
                return INSTANCE?: Room.databaseBuilder(
                    context ,
                    NoteDatabase::class.java,
                    "Note_db",
                ).build().also{
                    INSTANCE= it
                }
            }
        }
    }
}