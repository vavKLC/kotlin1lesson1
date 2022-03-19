package com.example.myapplication.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.viewModel.BookViewModel
import com.example.myapplication.R
import com.example.myapplication.adapters.BookAdapter
import com.example.myapplication.client.BookClient
import com.example.myapplication.databinding.FragmentBookBinding
import com.example.myapplication.models.BookModel

class BookFragment : Fragment(R.layout.fragment_book) {
    private val viewBinding by viewBinding(FragmentBookBinding::bind)
    private val adapter = BookAdapter({ BookModel -> onCLick(BookModel) })
    private val bookViewModel : BookViewModel by activityViewModels()
    private fun onCLick(bookModel: BookModel) {
        bookViewModel.putDescription(bookModel.description)
        Navigation.findNavController(requireView()).navigate(R.id.descriptionFragment)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter.setList(BookClient().getBooks())
        viewBinding.recyclerviewBook.adapter = adapter
    }

    

}
