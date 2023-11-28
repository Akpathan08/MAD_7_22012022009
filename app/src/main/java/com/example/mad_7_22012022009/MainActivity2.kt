package com.example.mad_7_22012022009

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.mad_7_22012022009.databinding.ActivityMainBinding
import com.example.mad_7_22012022009.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        webviewert()
        binding.btn.setOnClickListener {
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }
    }
    private val ytid = "watch?v=ebfV2J4lso4"
    private fun webviewert(){
        val webSettings: WebSettings = binding.webview.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.webview.loadUrl("https://m.youtube.com/$ytid")
    }
}
