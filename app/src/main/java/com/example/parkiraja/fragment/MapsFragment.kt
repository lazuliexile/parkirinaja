package com.example.parkiraja.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.parkiraja.CameraActivity
import com.example.parkiraja.MapsActivity
import com.example.parkiraja.R
import com.example.parkiraja.databinding.FragmentMapsBinding
import com.example.parkiraja.databinding.FragmentScanBinding


class MapsFragment : Fragment() {


    private var _binding : FragmentMapsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.maps.setOnClickListener(){
            goToMaps()
        }
    }

    private fun goToMaps() {
        val intent = Intent(context, MapsActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }
}