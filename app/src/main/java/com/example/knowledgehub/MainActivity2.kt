package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val androidDevelopment=findViewById<CardView>(R.id.topic1)
        val webDevelopment = findViewById<CardView>(R.id.topic2)
        val blockChain=findViewById<CardView>(R.id.topic3)
        val cybersecurity=findViewById<CardView>(R.id.topic4)
        val artificialIntelligence=findViewById<CardView>(R.id.topic5)
        val IOT=findViewById<CardView>(R.id.topic6)
        val supportButton=findViewById<Button>(R.id.support)

        androidDevelopment.setOnClickListener {
            intent= Intent(this,Android_activity::class.java)
            startActivity(intent)
        }

        webDevelopment.setOnClickListener {
            intent= Intent(this,Web_activity::class.java)
            startActivity(intent)
        }

        blockChain.setOnClickListener {
            intent= Intent(this,blockChain_activity::class.java)
            startActivity(intent)
        }

        cybersecurity.setOnClickListener {
            intent= Intent(this,ML_activity::class.java)
            startActivity(intent)
        }

        artificialIntelligence.setOnClickListener {
            intent= Intent(this,AI_activity::class.java)
            startActivity(intent)
        }

        IOT.setOnClickListener {
            intent= Intent(this,IOT_activity::class.java)
            startActivity(intent)
        }

        supportButton.setOnClickListener {
            intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:1234567890"))
            startActivity(intent)
        }
    }
}