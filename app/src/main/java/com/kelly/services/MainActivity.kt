package com.kelly.services

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.kelly.services.databinding.ActivityCallBinding
import com.kelly.services.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            openHomePage()
        }
    }

    private fun openHomePage() {
        val username: String = binding.etUsernameInput.text.toString()
        val eMail: String = binding.etEmailInput.text.toString()
        val password: String = binding.etPasswordInput.text.toString()
        val homeIntent: Intent = Intent(this, HomeActivity::class.java)
        startActivity(homeIntent)
    }
}