package com.example.mars_muti.pertemuan5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mars_muti.databinding.ActivityFifthBinding

class FifthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFifthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Klik tombol WebView untuk buka WebViewActivity
        binding.btnWebView.setOnClickListener { // Jika ID tombol di XML kamu beda (misal btnToWebView), sesuaikan di sini
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }
    }
}