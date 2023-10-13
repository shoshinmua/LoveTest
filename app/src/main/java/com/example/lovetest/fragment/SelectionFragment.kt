package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.databinding.FragmentSelectionBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class SelectionFragment : Fragment() {

    lateinit var navController: NavController

    private var _binding: FragmentSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSelectionBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        binding.option1.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment)
        }

        binding.option2.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment)
        }

        binding.option3.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment)
        }

        binding.option4.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_resultFragment)
        }

        binding.btBack.setOnClickListener {
            navController.navigate(R.id.action_selectionFragment_to_questionFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}