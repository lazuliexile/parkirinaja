package com.example.parkiraja

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.example.parkiraja.adapter.ViewPageAdapter
import com.example.parkiraja.databinding.ActivityMainBinding
import com.example.parkiraja.fragment.*

class MainActivity : AppCompatActivity() {
    private var doubleBack : Boolean = false
    fun doubleBackToExit(){

        if(doubleBack){
            super.onBackPressed()
            return
        }

        this.doubleBack = true

        Toast.makeText(this," Anda Akan Logout ",Toast.LENGTH_SHORT).show()

        Handler().postDelayed( {doubleBack = false}, 2000)
    }

    override fun onBackPressed() {
        doubleBackToExit()
    }

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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