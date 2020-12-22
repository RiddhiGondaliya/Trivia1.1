package com.example.trivia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.trivia.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)
        //Navigation.findNavController(view) fun is used to get an instance of the navigation controller
         //binding.playButton.setOnClickListener{view :View ->
       // Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)}

        // As android KTX has a extension of view we can navigate the fragments by using navController

       // binding.playButton.setOnClickListener{view : View ->
         //   view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        //}
        // Also we can use below method by removing anonymous onClick function above

        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )


        return binding.root
    }


}