package com.example.mars_muti

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mars_muti.Home.HomeFragment
import com.example.mars_muti.Message.MessageFragment
import com.example.mars_muti.More.MoreFragment
import com.example.mars_muti.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tampilkan HomeFragment pertama kali
        if (savedInstanceState == null) {
            replaceFragment(HomeFragment())
        }

        // Listener Bottom Navigation
        binding.bottomNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home1 -> replaceFragment(HomeFragment())
                R.id.message -> replaceFragment(MessageFragment())
                R.id.more -> replaceFragment(MoreFragment())
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}