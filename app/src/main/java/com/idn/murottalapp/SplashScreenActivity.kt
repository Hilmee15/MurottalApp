package com.idn.murottalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.idn.murottalapp.utils.MediaService
import com.idn.murottalapp.utils.MediaService.Companion.mp

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var delay : Long = 2000

        if (mp != null && mp?.isPlaying() as Boolean) {
            delay = 0
        }

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, ListSurahActivity::class.java))
            finish()
        }, delay)
    }
}