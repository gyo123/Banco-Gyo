package com.example.bancomr

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.bancomr.databinding.ActivityInvestimentoBinding

class investimento : AppCompatActivity() {
    private lateinit var binding: ActivityInvestimentoBinding
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvestimentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbarInv
        toolbar.title = "Investimento"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(400, 0, 400, 0)
        toolbar.setBackgroundColor(getColor(R.color.light_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_voltar))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}