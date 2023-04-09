package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class blockChain_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_chain)

        val cplus=findViewById<CardView>(R.id.cplus)
        val solidity=findViewById<CardView>(R.id.solidity)
        val metamask=findViewById<CardView>(R.id.metamask)
        val geth=findViewById<CardView>(R.id.geth)
        val ganache=findViewById<CardView>(R.id.ganache)
        val back=findViewById<Button>(R.id.back)

        cplus.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://medium.com/neptune-insights/ultimate-cheat-sheet-to-start-coding-in-blockchain-how-can-we-c-9b4eeff723f8"))
            startActivity(intent)
        }

        solidity.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/introduction-to-solidity/"))
            startActivity(intent)
        }

        metamask.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/how-to-install-and-use-metamask-on-google-chrome/"))
            startActivity(intent)
        }

        geth.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://geth.ethereum.org/"))
            startActivity(intent)
        }

        ganache.setOnClickListener {
            intent= Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://trufflesuite.com/ganache/"))
            startActivity(intent)
        }

        back.setOnClickListener {
            intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}