package com.shruti.uitaskrelative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import com.shruti.uitaskrelative.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navController)
                as androidx.navigation.fragment.NavHostFragment
        navController = navHostFragment.navController
        binding.tvSignIn.setOnClickListener {
            navController.navigate(R.id.signInFragment)
        }
        binding.tvSignUp.setOnClickListener{
            navController.navigate(R.id.signUpFragment)
        }
    }
}