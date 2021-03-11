package com.netanel.allinone.intefaces

import android.view.KeyEvent
import android.view.MotionEvent
import android.webkit.WebView

interface IOnBackPressed {
    fun goBack(webView: WebView) {
        webView.setOnKeyListener { _, _, keyEvent ->
            if (keyEvent.keyCode == KeyEvent.KEYCODE_BACK && !webView.canGoBack()) {
                false
            } else if (keyEvent.keyCode == KeyEvent.KEYCODE_BACK && keyEvent.action == MotionEvent.ACTION_UP) {
                webView.goBack()
                true
            } else true
        }
    }
}
