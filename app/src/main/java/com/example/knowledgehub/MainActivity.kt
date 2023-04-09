package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start=findViewById<Button>(R.id.start)

        start.setOnClickListener {
        intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}