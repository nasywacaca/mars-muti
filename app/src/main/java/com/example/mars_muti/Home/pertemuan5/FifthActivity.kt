package com.example.mars_muti.Home.pertemuan5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mars_muti.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aksi tombol kembali di Toolbar
        binding.toolbar.setNavigationOnClickListener {
            finish() // Menutup Activity dan kembali ke layar sebelumnya
        }
    }
}