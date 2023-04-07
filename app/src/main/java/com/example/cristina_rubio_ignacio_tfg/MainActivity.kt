package com.example.cristina_rubio_ignacio_tfg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristina_rubio_ignacio_tfg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}