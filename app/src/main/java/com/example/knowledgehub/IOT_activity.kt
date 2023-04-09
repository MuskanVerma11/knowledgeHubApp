package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class IOT_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iot)


        val arduino=findViewById<CardView>(R.id.arduino)
        val flutter=findViewById<CardView>(R.id.flutter)
        val cplus=findViewById<CardView>(R.id.cplus)
        val c=findViewById<CardView>(R.id.c)
        val sensors=findViewById<CardView>(R.id.sensors)
        val back=findViewById<Button>(R.id.back)

        arduino.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://docs.arduino.cc/software/ide-v1"))
            startActivity(intent)
        }

        flutter.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.expertappdevs.com/blog/fact-why-flutter-is-perfect-for-iot-apps#:~:text=Building%20IoT%20Solutions%20with%20Flutter,-At%20this%20point&text=You%20can%20connect%20an%20electrical,you%20develop%20an%20IoT%20solution."))
            startActivity(intent)
        }

        cplus.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/cpp/default.asp"))
            startActivity(intent)
        }

        c.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.w3schools.com/c/c_intro.php"))
            startActivity(intent)
        }

        sensors.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/sensors-in-internet-of-thingsiot/"))
            startActivity(intent)
        }

        back.setOnClickListener {
            intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}