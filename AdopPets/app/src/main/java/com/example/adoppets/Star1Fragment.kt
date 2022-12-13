package com.example.adoppets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.adoppets.R


class Star1Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity_star1)

        val btn1 = findViewById<Button>(R.id.button1)

        btn1.setOnClickListener {
            startActivity(Intent(this@Star1Fragment, Star2Fragment::class.java))
//            overridePendingTransition(R.anim.slide_in_left)
        }
    }
}