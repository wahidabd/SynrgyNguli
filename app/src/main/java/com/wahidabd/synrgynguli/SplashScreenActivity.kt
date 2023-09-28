package com.wahidabd.synrgynguli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.wahidabd.synrgynguli.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        splashTime()
    }

    fun splashTime(){
        val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }
        }
        timer.start()
    }
}