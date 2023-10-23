package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import com.example.lovetest.databinding.FragmentSelectionBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SelectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class SelectionFragment : Fragment(), View.OnClickListener {

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

        binding.btBack.setOnClickListener(this)
        binding.option1.setOnClickListener(this)
        binding.option2.setOnClickListener(this)
        binding.option3.setOnClickListener(this)
        binding.option4.setOnClickListener(this)
    }

    override fun onClick(v: View?){

        when(v?.id){
            R.id.option_1  -> {navigateWithIndex(1)}
            R.id.option_2  -> {navigateWithIndex(2)}
            R.id.option_3  -> {navigateWithIndex(3)}
            R.id.option_4  -> {navigateWithIndex(4)}
            R.id.bt_back  -> {
                navController.popBackStack()
            }
        }
    }

    fun navigateWithIndex(index : Int){
        val bundle = bundleOf("index" to index)
        navController.navigate(R.id.action_selectionFragment_to_resultFragment, bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}

