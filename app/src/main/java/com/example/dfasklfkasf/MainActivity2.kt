package com.example.dfasklfkasf

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dfasklfkasf.databinding.ActivityMain2Binding
import com.example.dfasklfkasf.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentFromMain = intent

        val name = intentFromMain.getStringExtra("name")
        binding.name.text =name

        binding.back.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }




    }
    override fun onStart() {
        println("start 2")
        super.onStart()
    }

    override fun onResume() {
        println("resume 2")

        super.onResume()
    }

    override fun onPause() {
        println("pause 2")
        super.onPause()
    }
    override fun onStop() {
        println("stop 2")

        super.onStop()
    }

    override fun onDestroy() {
        println("destroy  2")

        super.onDestroy()
    }
}