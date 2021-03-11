package com.netanel.allinone.intefaces

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.util.Log
import android.view.View
import android.webkit.*
import android.widget.ProgressBar
import androidx.annotation.RequiresApi

interface InitFragments {
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun showFrags(webView: WebView, link: String, progressBar: ProgressBar) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true)
        webView.apply {
            webChromeClient = object : WebChromeClient() {
                override fun onConsoleMessage(consoleMessage: ConsoleMessage?): Boolean {
                    Log.d(
                        "Netanel", consoleMessage?.message() + " -- From line "
                                + consoleMessage?.lineNumber() + " of "
                                + consoleMessage?.sourceId()
                    )
                    return true
                }

                @RequiresApi(Build.VERSION_CODES.N)
                override fun onProgressChanged(view: WebView?, newProgress: Int) {
                    super.onProgressChanged(view, newProgress)
                    progressBar.visibility = View.VISIBLE
                    progressBar.progressTintList = ColorStateList.valueOf(Color.DKGRAY);
                    progressBar.setProgress(newProgress, true)
                }
            }

            this.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    progressBar.visibility = View.GONE
                    Log.d("onPageFinished", "page finish url: $url")
                }
            }
            val webSettings = this.settings
            webSettings.javaScriptEnabled = true
            webSettings.domStorageEnabled = true
            webSettings.setNeedInitialFocus(true)
            webView.loadUrl(link)
        }
    }
}