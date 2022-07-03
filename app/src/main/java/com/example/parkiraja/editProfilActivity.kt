package com.example.parkiraja

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parkiraja.databinding.ActivityEditProfilBinding
import com.example.parkiraja.databinding.ActivityLandingBinding
import com.example.parkiraja.databinding.ActivityMainBinding
import com.example.parkiraja.databinding.FragmentUserBinding
import com.google.firebase.auth.FirebaseAuth

class editProfilActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditProfilBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        binding = ActivityEditProfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.selesai.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }



}