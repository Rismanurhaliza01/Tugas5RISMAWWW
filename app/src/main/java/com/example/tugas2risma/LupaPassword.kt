package com.example.tugas2risma

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tugas2risma.databinding.LupaPasswordBinding

class LupaPassword : AppCompatActivity() {

    private lateinit var binding: LupaPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.lupa_password)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.hp)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = LupaPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView7.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}