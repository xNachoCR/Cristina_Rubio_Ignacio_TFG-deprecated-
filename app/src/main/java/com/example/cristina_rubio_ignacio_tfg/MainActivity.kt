package com.example.cristina_rubio_ignacio_tfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cristina_rubio_ignacio_tfg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener { loginScreen() }
        binding.btnSignUp.setOnClickListener { registerScreen() }
    }

    //Función que lleva al SignUpActivity al pulsar el botón "btn_sign_up"
    private fun registerScreen() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    //Función que lleve al LoginActivity al pulsar el botón "btn_login"
    private fun loginScreen() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}