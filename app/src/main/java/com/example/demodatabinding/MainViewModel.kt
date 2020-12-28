package com.example.demodatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel()  {

    private val _message  = MutableLiveData("")

    val message: LiveData<String> get() = _message


    fun onClick(){
        _message.value = "Hola Mundo"
    }

}