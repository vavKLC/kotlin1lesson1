package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ListBookHolderBinding
import com.example.myapplication.models.BookModel

class BookAdapter(
    val onItemClick : (BookModel) -> Unit
) :
    RecyclerView.Adapter<BookAdapter.BookHolder>() {
    private var list: List<BookModel> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookAdapter.BookHolder =
        BookHolder(
            ListBookHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    fun setList(list: List<BookModel>){
        this.list = list
    }

    override fun onBindViewHolder(holder: BookAdapter.BookHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class BookHolder(private val viewBinding: ListBookHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun onBind(bookModel: BookModel) {
            viewBinding.bookImg.setImageResource(bookModel.image)
            viewBinding.tittleBookTv.text = bookModel.tittle
            viewBinding.root.setOnClickListener {
                onItemClick(bookModel)
            }
        }


    }
}
