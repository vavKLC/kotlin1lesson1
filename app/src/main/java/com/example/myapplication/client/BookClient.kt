package com.example.myapplication.client

import com.example.myapplication.R
import com.example.myapplication.models.BookModel

class BookClient {

    fun getBooks(): List<BookModel> {
        val list = ArrayList<BookModel>()
        list.add(
            BookModel(
                R.drawable.war, "Война и мир", " qwerty qwety qwery"
            )
        )
        list.add(
            BookModel(
                R.drawable.tom, "Том Сойер", " eqqw eqw ewe eqw eq"
            )
        )
        list.add(
            BookModel(
                R.drawable.anime, "АНИМЕ СИЛА ", "УДВАЖЫПМФЬВЛД"
            )
        )

        return list

    }
}