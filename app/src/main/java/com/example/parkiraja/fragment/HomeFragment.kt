package com.example.parkiraja.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.parkiraja.R
import com.example.parkiraja.TempatParkirActivity
import com.example.parkiraja.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

//    private var _binding: FragmentHomeBinding? = null
//    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        _binding = FragmentHomeBinding.inflate(inflater, container, false)
//        val view = binding.root

        val bind = FragmentHomeBinding.inflate(layoutInflater)

        bind.CheckIn.setOnClickListener{
                val intent = Intent (this@HomeFragment.requireContext(), TempatParkirActivity::class.java)
                startActivity(intent)
        }
        return bind.root
    }
}