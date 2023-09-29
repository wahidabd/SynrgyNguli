package com.wahidabd.synrgynguli.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.databinding.ActivityForgotPasswordBinding
import com.wahidabd.synrgynguli.utils.onBackPress

class ForgotPasswordActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, ForgotPasswordActivity::class.java))
        }
    }

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { onBackPress() }
        binding.submitButton.setOnClickListener { VerificationActivity.start(this) }
    }
}