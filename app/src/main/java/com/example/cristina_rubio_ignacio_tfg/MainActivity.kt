package com.example.cristina_rubio_ignacio_tfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristina_rubio_ignacio_tfg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Loginbtn.setOnClickListener { loginScreen() }
        binding.Registerbtn.setOnClickListener { registerScreen() }
    }

    private fun registerScreen() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun loginScreen() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}