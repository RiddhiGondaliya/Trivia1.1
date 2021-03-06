package com.example.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.trivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val navController =  this.findNavController(R.id.mynavHostFragment)
        //we can hookeup the navigation UI to the actionbar
        NavigationUI.setupActionBarWithNavController(this, navController)

    }
    // used where we need to make navigation handle what happens when up is pressed

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.mynavHostFragment)
        return  navController.navigateUp()

        return super.onSupportNavigateUp()
    }
}