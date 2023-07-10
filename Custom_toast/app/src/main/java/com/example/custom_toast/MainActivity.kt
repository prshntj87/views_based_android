package com.example.custom_toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.viewmodel.viewModelFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShow = findViewById<Button>(R.id.btnShow)
        btnShow.setOnClickListener {
            Toast(this).apply {

                duration = Toast.LENGTH_LONG
                view
            }
        }

    }
}