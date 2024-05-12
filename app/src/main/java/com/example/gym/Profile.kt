package com.example.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Profile : AppCompatActivity() {

    private lateinit var adapter: TodoAdapter
    private lateinit var viewModel: MainActvityData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val recyclerView: RecyclerView = findViewById(R.id.rvTodoList)
        val repository = NoteRepository(NoteDatabase.getInstance(this))

        viewModel = ViewModelProvider(this)[MainActvityData::class.java]

        viewModel.data.observe(this) {
            adapter = TodoAdapter(it, repository, viewModel)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this)
        }
        CoroutineScope(Dispatchers.IO).launch {
            val data = repository.getAllNoteItems()

            runOnUiThread {
                viewModel.setData(data)
            }
        }
        val addItem: ImageView = findViewById(R.id.imageView2)
        displayAlert(repository)
    }
}
 private fun displayAlert(repository:NoteRepository) {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("Enter New Note item:")
        builder.setMessage("Enter the note below:")

     val input = EditText(this)
     input.inputType = InputType.TYPE_CLASS_TEXT

        builder.setView(input)

        builder.setPositiveButton("Ok") { dialog, which ->
            val item = input.text.toString()
            CoroutineScope(Dispatchers.IO).launch {
                repository.insert(Note(item))
            }
        }


        builder.setNegativeButton("Cancel") { dialog, which ->
            dialog.cancel()
        }
        val alertDialog = builder.create()
        alertDialog.show()
    }




