package com.example.myapplication.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.viewModel.BookViewModel
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentDescriptionBinding
import kotlinx.coroutines.launch

class DescriptionFragment : Fragment(R.layout.fragment_description) {
    private val viewBinding by viewBinding(FragmentDescriptionBinding::bind)
    private val viewModel : BookViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewLifecycleOwner.lifecycleScope.launch{
            viewModel.description.observe(viewLifecycleOwner){description ->
                viewBinding.description.text = description
            }
        }
    }

}