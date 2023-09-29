package com.wahidabd.synrgynguli.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.databinding.ActivitySignUpPswBinding

class SignupActivity : AppCompatActivity() {
    companion object{
        fun start(context: Context){
            context.startActivity(Intent(context, SignupActivity::class.java))
        }
    }

    private lateinit var binding: ActivitySignUpPswBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpPswBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.materialButton.setOnClickListener { handleToLogin() }
        binding.tvLogin.setOnClickListener { handleToLogin() }
        binding.backButton.setOnClickListener { handleToLogin() }
    }

    private fun handleToLogin(){
        LoginActivity.start(this)
    }
}