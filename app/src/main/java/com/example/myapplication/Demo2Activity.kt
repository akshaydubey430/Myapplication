package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.Health2Binding
import com.example.myapplication.databinding.Health3Binding

class Demo2Activity : AppCompatActivity() {
    private lateinit var binding: Health3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Health3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton.setOnClickListener {
            // Switch to SecondActivity
            val intent = Intent(this, BMIActivity::class.java)
            startActivity(intent)
        }
    }
}