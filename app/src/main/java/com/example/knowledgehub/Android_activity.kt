package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import androidx.cardview.widget.CardView

class Android_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val java=findViewById<CardView>(R.id.languageUsed)
        val kotlin=findViewById<CardView>(R.id.languageUsed1)
        val xml=findViewById<CardView>(R.id.forUI)
        val firebase=findViewById<CardView>(R.id.fordatabase)
        val androidStudio=findViewById<CardView>(R.id.software)
        val back=findViewById<Button>(R.id.back)

        java.setOnClickListener {
                intent= Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://www.geeksforgeeks.org/learn-java-for-android-app-development-a-complete-guide/"))
                startActivity(intent)
        }

        kotlin.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.android.com/courses/android-basics-kotlin/course?gclid=Cj0KCQjw8qmhBhClARIsANAtbof4fQzSsTcRr7yNSROzB7s9e94V9XDoGcT2mFqtyZVQGhXeRuik2roaAjlaEALw_wcB&gclsrc=aw.ds"))
            startActivity(intent)
        }

        xml.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/a-complete-guide-to-learn-xml-for-android-app-development/"))
            startActivity(intent)
        }

        firebase.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/adding-firebase-to-android-app/"))
            startActivity(intent)
        }

        androidStudio.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.android.com/studio"))
            startActivity(intent)
        }

        back.setOnClickListener {
            intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

    }
}