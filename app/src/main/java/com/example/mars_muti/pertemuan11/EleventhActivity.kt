package com.example.mars_muti.pertemuan11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mars_muti.R
import com.example.mars_muti.databinding.ActivityEleventhBinding
import com.google.android.material.tabs.TabLayoutMediator

class EleventhActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEleventhBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEleventhBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar Back Button
        binding.toolbar.setNavigationOnClickListener {
            finish()
        }

        // Setup ViewPager2 Adapter
        val adapter = EleventhTabsAdapter(this)
        binding.viewPager.adapter = adapter

        // Hubungkan TabLayout dengan ViewPager2 & Pasang Ikon pada Tab
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Tab A"
                    tab.setIcon(R.drawable.home1) // atau ikon Tab A kamu
                }
                1 -> {
                    tab.text = "Tab B"
                    tab.setIcon(R.drawable.home1) // atau ikon Tab B kamu
                }
                2 -> {
                    tab.text = "Tab C"
                    tab.setIcon(R.drawable.ic_shopping) // Menggunakan ic_shopping.xml
                }
            }
        }.attach()
    }
}