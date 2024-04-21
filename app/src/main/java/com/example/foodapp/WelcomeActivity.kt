package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodapp.databinding.ActivityMainBinding
import com.example.foodapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityWelcomeBinding

    private val binding by lazy {

        ActivityWelcomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNext.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}