package com.kigambo.coopos
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebSettings

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w = WebView(this)
        w.webViewClient = WebViewClient()
        val s = w.settings
        s.javaScriptEnabled = true
        s.domStorageEnabled = true
        s.databaseEnabled = true
        s.cacheMode = WebSettings.LOAD_NO_CACHE
        
        w.loadUrl("https://kigambo-coopos.netlify.app/")
        setContentView(w)
    }
}
