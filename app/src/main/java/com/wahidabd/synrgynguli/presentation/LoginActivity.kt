package com.wahidabd.synrgynguli.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    companion object{
        fun start(context: Context){
            context.startActivity(Intent(context, LoginActivity::class.java))
        }
    }

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        statusBarColor()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvForgotPassword.setOnClickListener {
            ForgotPasswordActivity.start(this)
        }

        binding.btnLogin.setOnClickListener {
            HomeActivity.start(this)
        }

        binding.tvRegister.setOnClickListener {
            SignupActivity.start(this)
        }
    }

    fun statusBarColor(){
        val color = ContextCompat.getColor(this, R.color.white)
        window.statusBarColor = color
    }
}