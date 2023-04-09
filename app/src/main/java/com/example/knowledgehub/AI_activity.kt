package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class AI_activity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai)

        val info=findViewById<Button>(R.id.info)
        info.setOnClickListener {
            intent= Intent(this,IntroAI::class.java)
            startActivity(intent)
        }

        val datascience=findViewById<CardView>(R.id.datascience)
        val machinelearning=findViewById<CardView>(R.id.machinelearning)
        val deeplearning=findViewById<CardView>(R.id.deeplearning)
        val dataengineer=findViewById<CardView>(R.id.dataengineer)
        val bigdata=findViewById<CardView>(R.id.bigdata)
        val back=findViewById<Button>(R.id.back)

        datascience.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.simplilearn.com/tutorials/data-science-tutorial/how-to-become-a-data-scientist"))
            startActivity(intent)
        }

        machinelearning.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.ibm.com/in-en/topics/machine-learning"))
            startActivity(intent)
        }

        deeplearning.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.ibm.com/in-en/topics/deep-learning"))
            startActivity(intent)
        }

        dataengineer.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://intellipaat.com/blog/what-is-data-engineering/"))
            startActivity(intent)
        }

        bigdata.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.coursera.org/articles/big-data-engineer?utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA__branded_FTCOF_courseraplus_arte_PMax&utm_content=Degree&campaignid=19607944793&adgroupid=&device=c&keyword=&matchtype=&network=x&devicemodel=&adpostion=&creativeid=&hide_mobile_promo&gclid=Cj0KCQjwxMmhBhDJARIsANFGOSvWBSw3FFq1FuwmdTM6ux-uQ39e3vxufxGYS3WFk3Shzr8WD1urT4gaAisYEALw_wcB"))
            startActivity(intent)
        }

        back.setOnClickListener {
            intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}