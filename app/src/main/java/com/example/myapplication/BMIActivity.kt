package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.Health1Binding

class BMIActivity : AppCompatActivity() {
    private lateinit var binding: Health1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Health1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener {
            calculateBMI()
        }
        binding.button4.setOnClickListener {
            // Switch to SecondActivity
            val intent = Intent(this, Demo3Activity::class.java)
            startActivity(intent)
        }
    }

    private fun calculateBMI() {
        val height = binding.editTextHeight.text.toString().toFloatOrNull()
        val weight = binding.editTextWeight.text.toString().toFloatOrNull()

        if (height != null && weight != null) {
            val bmi = weight / (height * height)
            displayResult(bmi)
        } else {
            binding.textViewResult.text = "Invalid input. Please enter valid height and weight."
        }
    }

    private fun displayResult(bmi: Float) {
        val resultText = when {
            bmi < 18.5 -> "Underweight"
            bmi < 24.9 -> "Normal Weight"
            bmi < 29.9 -> "Overweight"
            else -> "Obese"
        }

        binding.textViewResult.text = "BMI: ${String.format("%.2f", bmi)}\n$resultText"
    }
}
