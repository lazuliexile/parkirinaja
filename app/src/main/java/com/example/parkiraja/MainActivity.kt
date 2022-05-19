package com.example.parkiraja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parkiraja.adapter.ViewPageAdapter
import com.example.parkiraja.databinding.ActivityMainBinding
import com.example.parkiraja.fragment.HomeFragment
import com.example.parkiraja.fragment.UserFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()
    }

    private fun setupTab() {
        val adapter = ViewPageAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), "Home")
        adapter.addFragment(UserFragment(), "User")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.person)
    }
}