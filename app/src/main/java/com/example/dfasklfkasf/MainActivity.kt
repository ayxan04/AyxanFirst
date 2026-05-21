package com.example.dfasklfkasf

import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dfasklfkasf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sum.setOnClickListener {
            val a = binding.editTextText.text.toString().toIntOrNull()
            val b = binding.editTextText2.text.toString().toIntOrNull()

            if (a != null && b != null) {
                val cem = a + b
                binding.textView.text = cem.toString()
            } else {
                binding.textView.text = "Duzgfun daxil et"
            }

            }
        binding.minus.setOnClickListener {
            val a = binding.editTextText.text.toString().toIntOrNull()
            val b = binding.editTextText2.text.toString().toIntOrNull()

            if (a != null && b != null) {
                val minus = a - b
                binding.textView.text = minus.toString()
            } else {
                binding.textView.text = "Duzgfun daxil et"
            }
        }
    }}