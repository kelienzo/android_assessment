package com.kelly.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.kelly.services.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.btnContinue.setOnClickListener {
                openCallPage()
            }
    }
    private fun openCallPage(){
        val callIntent: Intent = Intent(this, CallActivity::class.java)
        startActivity(callIntent)
    }
}