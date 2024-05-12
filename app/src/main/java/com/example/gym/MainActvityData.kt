package com.example.gym

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainActvityData:ViewModel() {

    private val _data = MutableLiveData<List<Note>>()
    val data:LiveData<List<Note>> = _data
    fun setData(data:List<Note>){
        _data.value = data
    }



}