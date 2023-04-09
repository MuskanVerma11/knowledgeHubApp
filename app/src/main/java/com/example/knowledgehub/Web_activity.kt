package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Web_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val html=findViewById<CardView>(R.id.html)
        val css=findViewById<CardView>(R.id.css)
        val javaScript=findViewById<CardView>(R.id.javaScript)
        val python=findViewById<CardView>(R.id.python)
        val sql=findViewById<CardView>(R.id.sql)
        val back=findViewById<Button>(R.id.back)

        html.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/html/html_intro.asp"))
            startActivity(intent)
        }

        css.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/css/css_intro.asp"))
            startActivity(intent)
        }

        javaScript.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/js/js_intro.asp"))
            startActivity(intent)
        }

        python.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/python/python_intro.asp"))
            startActivity(intent)
        }

        sql.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/sql/sql_intro.asp"))
            startActivity(intent)
        }

        back.setOnClickListener {
            intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}