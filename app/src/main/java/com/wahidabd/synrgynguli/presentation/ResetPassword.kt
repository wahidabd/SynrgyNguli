package com.wahidabd.synrgynguli.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.databinding.ActivityResetPasswordBinding
import com.wahidabd.synrgynguli.utils.onBackPress

class ResetPassword : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, ResetPassword::class.java))
        }
    }

    private lateinit var binding: ActivityResetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { onBackPress() }
        binding.btnResetPassword.setOnClickListener {
            LoginActivity.start(this)
            finish()
        }
    }
}