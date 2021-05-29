package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class parkingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking)
        var description2 = findViewById<TextView>(R.id.tvguideline4)
        var btnnxt4 = findViewById<Button>(R.id.btnnext4)
        btnnxt4.setOnClickListener {
            intent = Intent(baseContext, roomActivity::class.java)
            startActivity(intent)
        }
    }
}