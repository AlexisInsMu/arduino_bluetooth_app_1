package com.example.bluetooth_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash: SplashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //se puede borrar

        screenSplash.setKeepOnScreenCondition {true}
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
        finish()
    }
}