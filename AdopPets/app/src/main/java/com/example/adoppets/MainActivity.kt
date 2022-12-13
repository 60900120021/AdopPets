package com.example.adoppets;

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val gambar1 : ImageView = findViewById(R.id.kanan)
        val gambar2 : ImageView = findViewById(R.id.kiri)
        val font1 : TextView = findViewById(R.id.top)
        val sideAnimation2 = AnimationUtils.loadAnimation(this, R.anim.top)
        val sideAnimation = AnimationUtils.loadAnimation(this,R.anim.kanan)
        val sideAnimation1 = AnimationUtils.loadAnimation(this, R.anim.kiri)
        gambar1.startAnimation(sideAnimation)
        gambar2.startAnimation(sideAnimation1)
        font1.startAnimation(sideAnimation2)
        Handler().postDelayed({
            startActivity(Intent(this, Star1Fragment::class.java))
            finish()
        },3000)


    }

}
