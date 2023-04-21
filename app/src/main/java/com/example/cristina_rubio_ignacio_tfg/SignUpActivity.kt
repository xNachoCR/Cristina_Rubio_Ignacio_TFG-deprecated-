package com.example.cristina_rubio_ignacio_tfg

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.cristina_rubio_ignacio_tfg.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity: AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener { signUpUser() }
    }

    //Función que hace el registro de usuario con control de errores
    private fun signUpUser() {
        if (binding.email.text.isNotEmpty() && binding.password.text.isNotEmpty() && binding.rePassword.text.isNotEmpty()){
            if (binding.password.text.toString().equals(binding.rePassword.text.toString()) && binding.password.text.toString().length >= 6){
                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(binding.email.text.toString(),
                        binding.password.text.toString()).addOnCompleteListener {

                            if(it.isSuccessful){
                                showLogin()
                            } else{
                                showAlert()
                            }
                    }
            }
        }
    }


    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Error al registrar usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showLogin(){
        val loginIntent = Intent(this, LoginActivity::class.java)
        startActivity(loginIntent)
    }
}