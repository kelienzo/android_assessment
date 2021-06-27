package com.kelly.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import com.kelly.services.databinding.ActivityCallBinding

class CallActivity : AppCompatActivity() {
    lateinit var binding: ActivityCallBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMakeCall.setOnClickListener {
            makeCall()
        }
    }
    fun makeCall(){
        val intent: Intent = Intent(Intent.ACTION_DIAL)
        startActivity(intent)
    }
}