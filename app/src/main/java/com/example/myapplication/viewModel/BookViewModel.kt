package com.example.myapplication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.client.BookClient
import com.example.myapplication.models.BookModel

class BookViewModel : ViewModel() {
    val description = MutableLiveData<String>()

    fun getBooks() : List<BookModel> = BookClient().getBooks()

    fun putDescription(text : String){
        description.value = text
    }
}