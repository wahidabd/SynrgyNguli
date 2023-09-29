package com.wahidabd.synrgynguli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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
        statusBarColor()
    }

    private fun handleNavigationToNextScreen(){
        val intent = Intent(this@SplashScreenActivity, SignupActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun statusBarColor(){
        val color = ContextCompat.getColor(this, R.color.base_color)
        window.statusBarColor = color
    }

    override fun onDestroy() {
        super.onDestroy()
        splashTimer.cancel()
    }
}