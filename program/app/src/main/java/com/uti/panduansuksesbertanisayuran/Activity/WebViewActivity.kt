package com.uti.panduansuksesbertanisayuran.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.uti.panduansuksesbertanisayuran.R

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Mengatur layout activity_web_view sebagai tampilan untuk aktivitas ini
        setContentView(R.layout.activity_web_view)

//        Mendapatkan data 'title' dari intent yang memulai aktivitas ini
        val title = intent.getStringExtra("title") ?: "Untitled"

        enableEdgeToEdge()
        setContentView(R.layout.activity_web_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}