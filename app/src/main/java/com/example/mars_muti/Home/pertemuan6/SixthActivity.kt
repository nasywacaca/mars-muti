package com.example.mars_muti.Home.pertemuan6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.mars_muti.R
import com.example.mars_muti.databinding.ActivitySixthBinding

class SixthActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySixthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySixthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Melaraskan margin supaya tidak tertutup oleh Status Bar / Jam
        ViewCompat.setOnApplyWindowInsetsListener(binding.mainSixth) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Paparkan fragment pertama secara default
        if (savedInstanceState == null) {
            replaceFragment(SatuFragment())
        }

        // Fungsi klik butang kembali (Ikon < dan teks Kembali)
        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.tvBack.setOnClickListener {
            finish()
        }

        // Fungsi tukar Fragment 1, 2, 3
        binding.btnFragment1.setOnClickListener {
            replaceFragment(SatuFragment())
        }

        binding.btnFragment2.setOnClickListener {
            replaceFragment(DuaFragment())
        }

        binding.btnFragment3.setOnClickListener {
            replaceFragment(TigaFragment())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_sixth, fragment)
            .commit()
    }
}