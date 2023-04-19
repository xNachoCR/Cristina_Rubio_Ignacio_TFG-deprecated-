package com.example.cristina_rubio_ignacio_tfg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cristina_rubio_ignacio_tfg.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}