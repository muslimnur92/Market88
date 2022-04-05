package com.example.market88.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.market88.R
import com.example.market88.databinding.ActivityLoginBinding
import com.example.market88.databinding.FragmentDashboardBinding
import com.example.market88.util.Prefs


class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val s = Prefs(this)
        if (s.getIslogin()){
            binding.tvStatus.text = "Sudah Login"
        } else binding.tvStatus.text = "Belum Login"

        binding.btnLogin.setOnClickListener {
            s.setIslogin(true)
            onBackPressed()
        }

        binding.btnLogin.setOnClickListener {
            s.setIslogin(false)
            onBackPressed()
        }



        Log.d("respom", "PESAN SINGKAT")

    }
}