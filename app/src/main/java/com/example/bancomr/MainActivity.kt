package com.example.bancomr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bancomr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saldo.setOnClickListener{
            intent = Intent(this,Saldo::class.java)
            startActivity(intent)
        }

        binding.faturas.setOnClickListener {
            intent = Intent(this, faturas::class.java)
            startActivity(intent)
        }

        binding.transf.setOnClickListener{
            intent = Intent(this, transf::class.java)
            startActivity(intent)
        }

        binding.poup.setOnClickListener {
            val intent = Intent(this, poupanca::class.java)
            startActivity(intent)
        }

        binding.emprest.setOnClickListener {
            val intent = Intent(this, emp::class.java)
            startActivity(intent)
        }

        binding.investimento.setOnClickListener {
            val intent = Intent(this, investimento::class.java)
            startActivity(intent)
        }



    }

}