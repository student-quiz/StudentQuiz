package com.app.studentquiz.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowManager
import com.app.studentquiz.databinding.ActivitySplashscreenBinding

class SplashscreenActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // This is used to hide the status bar and make the splash screen as a full screen activity.
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        // Adding the handler to after the a task after some delay.
        Handler(Looper.getMainLooper()).postDelayed({
            // Start the Intro Activity
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        },2500)
    }
}