package com.laboratorios.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.laboratorios.lab4.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickLogin(view:View) {
        if (binding.tvUserName.text.toString().trim().isEmpty())
            Toast.makeText(this, "Debe ingresar un UserName", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "UserName: ${binding.tvUserName.text.toString()}", Toast.LENGTH_SHORT).show()
    }
}


