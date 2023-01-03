package com.app.example //<- You have to put the package name here 

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import java.io.File

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val webView = findViewById<WebView>(R.id.web)

        webView.loadUrl("") //<- Insert Here Your Webpage or html file in repo but it has to be in the ""

        
        webView.settings.javaScriptEnabled = true


        webView.webViewClient = WebViewClient()

    }
    
}
