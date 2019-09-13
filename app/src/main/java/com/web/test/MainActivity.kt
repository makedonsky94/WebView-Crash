package com.web.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(webView) {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            WebView.setWebContentsDebuggingEnabled(true)
            loadUrl("https://tradingview.com/chart/")
        }
    }
}
