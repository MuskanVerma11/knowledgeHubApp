package com.example.knowledgehub

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class IntroAI : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_ai)

        val webView=findViewById<WebView>(R.id.web)
        webViewSetup(webView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(webView: WebView) {
        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true;
            loadUrl("https://i.am.ai/roadmap/#disclaimer")
        }
    }
}