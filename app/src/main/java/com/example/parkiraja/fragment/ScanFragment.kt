package com.example.parkiraja.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.budiyev.android.codescanner.CodeScanner
import com.example.parkiraja.CameraActivity
import com.example.parkiraja.LandingActivity
import com.example.parkiraja.R
import com.example.parkiraja.databinding.FragmentScanBinding
import com.example.parkiraja.databinding.FragmentUserBinding


class ScanFragment : Fragment() {

    private var _binding : FragmentScanBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentScanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonCamera.setOnClickListener(){
            goToCamera()
        }
    }

    private fun goToCamera() {
        val intent = Intent(context, CameraActivity::class.java)
        startActivity(intent)
        activity?.finish()
    }


}