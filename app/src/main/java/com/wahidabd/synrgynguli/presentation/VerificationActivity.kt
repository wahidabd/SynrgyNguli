package com.wahidabd.synrgynguli.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahidabd.synrgynguli.R
import com.wahidabd.synrgynguli.databinding.ActivityVerificationBinding
import com.wahidabd.synrgynguli.utils.onBackPress
import com.wahidabd.synrgynguli.utils.setTimer

class VerificationActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, VerificationActivity::class.java))
        }
    }

    private val countDown = setTimer(
        timer = 60000,
        interval = 1000,
        onTick = ::handleTick,
    )

    private val showVerificationCode = setTimer(
        timer = 1500,
        interval = 1000,
        onFinis = ::setVerificationCode
    )

    private lateinit var binding: ActivityVerificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        countDown.start()
        showVerificationCode.start()

        binding.imgBack.setOnClickListener { onBackPress() }
        binding.btnVerify.setOnClickListener { ResetPassword.start(this) }
    }

    private fun setVerificationCode() = with(binding){
        tvBox1.text = "3"
        tvBox2.text = "2"
        tvBox3.text = "6"
        tvBox4.text = "4"
    }

    private fun handleTick(time: Long) = with(binding){
        tvCountDown.text = getString(R.string.format_time_left, time)
    }

    override fun onDestroy() {
        super.onDestroy()
        countDown.cancel()
        showVerificationCode.cancel()
    }
}