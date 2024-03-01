package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.Health2Binding

class DemoActivity : AppCompatActivity() {
    private lateinit var binding: Health2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Health2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.start.setOnClickListener {
            // Switch to SecondActivity
            val intent = Intent(this, Demo2Activity::class.java)
            startActivity(intent)
        }
    }
}