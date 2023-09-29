package com.wahidabd.synrgynguli.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahidabd.synrgynguli.databinding.ActivitySplashScreenBinding
import com.wahidabd.synrgynguli.utils.setTimer

class SplashScreenActivity : AppCompatActivity() {

    private val splashTimer = setTimer(
        timer = 3000,
        interval = 1000,
        onFinis = ::handleNavigationToNextScreen
    )

    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        splashTimer.start()
    }

    private fun handleNavigationToNextScreen(){
        val intent = Intent(this@SplashScreenActivity, SignupActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        splashTimer.cancel()
    }

}