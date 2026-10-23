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
        s.javaScriptCanOpenWindowsAutomatically = true
        // FIX FOR ERR_CACHE_MISS
        s.cacheMode = WebSettings.LOAD_NO_CACHE
        s.setAppCacheEnabled(false)
        
        // USE NETLIFY - NOT web.app - web.app blocks WebView!
        w.loadUrl("https://kigambo-coopos.netlify.app/")
        setContentView(w)
    }
}
