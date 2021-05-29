package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class dishesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dishes)
        var description5 = findViewById<TextView>(R.id.tvdescription5)
        var btnnext5 = findViewById<Button>(R.id.btntonext5)
        btnnext5.setOnClickListener {
            intent = Intent(baseContext, parkingActivity::class.java)
            startActivity(intent)
        }
    }
}