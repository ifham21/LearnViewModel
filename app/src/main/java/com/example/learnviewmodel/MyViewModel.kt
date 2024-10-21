package com.example.learnviewmodel

//View Model send and recieve the data such as delete and read
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private var counter = 0


    //create function for read
    fun getInitialCounter(): Int{
        return counter
    }


    //Update counter function
    fun getUpdatedCounter(): Int{
        return counter++
    }
}