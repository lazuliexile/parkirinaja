package com.example.parkiraja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parkiraja.databinding.ActivityEditProfilBinding
import com.example.parkiraja.databinding.ActivityLandingBinding
import com.example.parkiraja.databinding.FragmentUserBinding
import com.google.firebase.auth.FirebaseAuth

class editProfilActivity : AppCompatActivity() {

    lateinit var binding: ActivityEditProfilBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEditProfilBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.selesai.setOnClickListener{
            finish()
//            val intent = Intent(this, userFra::class.java)
//            startActivity(intent)

        }
    }



}