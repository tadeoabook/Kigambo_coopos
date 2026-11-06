package com.kigambo.coopos

import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.CookieManager

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w = WebView(this)

        // IMPORTANT FOR FIREBASE LOGIN
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(w, true)

        w.webViewClient = WebViewClient()
        w.webChromeClient = WebChromeClient()

        val s = w.settings
        s.javaScriptEnabled = true
        s.domStorageEnabled = true
        s.databaseEnabled = true
        s.javaScriptCanOpenWindowsAutomatically = true
        s.allowFileAccess = true
        s.allowContentAccess = true
        s.cacheMode = WebSettings.LOAD_NO_CACHE
        s.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        // Clear old Netlify cache
        w.clearCache(true)
        w.clearHistory()

        w.loadUrl("https://tadeoabook.github.io/Kigambo_coopos/")
        setContentView(w)
    }
}
