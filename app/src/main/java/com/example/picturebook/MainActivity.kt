package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var description1=findViewById<TextView>(R.id.tvdesciption1)
        var btnPage1=findViewById<Button>(R.id.btnpag1)
        btnPage1.setOnClickListener{
            intent= Intent(baseContext,hotel::class.java)
            startActivity(intent)
        }
    }
}