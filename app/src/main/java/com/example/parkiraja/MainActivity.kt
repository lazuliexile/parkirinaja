package com.example.parkiraja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parkiraja.adapter.ViewPageAdapter
import com.example.parkiraja.databinding.ActivityMainBinding
import com.example.parkiraja.fragment.*

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
        adapter.addFragment(HomeFragment(), " ")
        adapter.addFragment(ScanFragment(), " ")
        adapter.addFragment(MapsFragment(), " ")
        adapter.addFragment(FaqFragment(), " ")
        adapter.addFragment(UserFragment(), " ")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.home)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_camera_alt_24)
        binding.tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_map_24)
        binding.tabs.getTabAt(3)!!.setIcon(R.drawable.ic_baseline_help_24)
        binding.tabs.getTabAt(4)!!.setIcon(R.drawable.person)

    }
}