package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.Health2Binding
import com.example.myapplication.databinding.Health3Binding
import com.example.myapplication.databinding.Health4Binding

class Demo3Activity : AppCompatActivity() {
    private lateinit var binding: Health4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Health4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageButton4.setOnClickListener {
            // Switch to SecondActivity
            val intent = Intent(this, BMIActivity::class.java)
            startActivity(intent)
        }
    }}