package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class roomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        var description3 = findViewById<TextView>(R.id.tvdescription3)
        var btnnxt3 = findViewById<Button>(R.id.btnnextlbl2)
        btnnxt3.setOnClickListener {
            intent = Intent(baseContext, dishesActivity::class.java)
            startActivity(intent)
        }
    }
}