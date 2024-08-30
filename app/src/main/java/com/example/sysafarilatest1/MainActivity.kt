package com.example.sysafarilatest1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val clickMeButton: Button = findViewById(R.id.main_btn_click_me);

        clickMeButton.setOnClickListener {
            Log.v("CLICK", "Button on main clicked is clicked")
            // clickMeButton.text = "Button already clicked"
            val intent = Intent(this, SecondActivity2::class.java)
            startActivity(intent)
        }
    }
}