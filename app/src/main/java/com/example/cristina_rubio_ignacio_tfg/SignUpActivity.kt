package com.example.cristina_rubio_ignacio_tfg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cristina_rubio_ignacio_tfg.databinding.ActivityRegisterBinding

class SignUpActivity: AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}