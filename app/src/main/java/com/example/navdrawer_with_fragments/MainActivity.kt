package com.example.navdrawer_with_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        navController=Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupWithNavController(navigation_view,navController)
        NavigationUI.setupActionBarWithNavController(this,navController,layoutDrawer)



    }

    override fun onSupportNavigateUp(): Boolean {

        return NavigationUI.navigateUp(
            navController,
            layoutDrawer
        )
    }
}