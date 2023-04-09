package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class ML_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ml)

        val ossec=findViewById<CardView>(R.id.ossec)
        val axcrypt=findViewById<CardView>(R.id.axCrypt)
        val acunetix=findViewById<CardView>(R.id.acunetix)
        val python=findViewById<CardView>(R.id.python)
        val javascript=findViewById<CardView>(R.id.javascript)
        val back=findViewById<Button>(R.id.back)

        ossec.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.ossec.net/about/"))
            startActivity(intent)
        }

        axcrypt.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://axcrypt.net/"))
            startActivity(intent)
        }

        acunetix.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.acunetix.com/"))
            startActivity(intent)
        }

        python.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://johnsyvineela.medium.com/python-for-cyber-security-lesson-1-introduction-to-python-1976d817976"))
            startActivity(intent)
        }

        javascript.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://snyk.io/learn/javascript-security/"))
            startActivity(intent)
        }

        back.setOnClickListener {
            intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}