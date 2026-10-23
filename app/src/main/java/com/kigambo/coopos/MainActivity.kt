package com.kigambo.coopos
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w = WebView(this)
        w.webViewClient = WebViewClient()
        w.settings.javaScriptEnabled = true
        w.settings.domStorageEnabled = true
        w.loadUrl("https://kigambo-coopos.netlify.app")
        setContentView(w)
    }
}
