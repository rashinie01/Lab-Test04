package com.example.gym

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class TodoAdapter(items:List<Note>,repository: NoteRepository,viewModel: MainActvityData):Adapter<TodoViewHolder>() {

    var context: Context?=null
    val items=items
    val repository=repository
    val viewModel=viewModel
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.note_item,parent,false)

        context=parent.context
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
      return items.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
     holder.titleTextView.text="Sample text"
     holder.imageView2.setOnClickListener {
         Toast.makeText(context,"Note Deleted",Toast.LENGTH_LONG).show()
     }
    }
}