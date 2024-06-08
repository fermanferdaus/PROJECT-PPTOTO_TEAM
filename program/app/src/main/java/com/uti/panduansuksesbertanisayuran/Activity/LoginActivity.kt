package com.uti.panduansuksesbertanisayuran.Activity

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.uti.panduansuksesbertanisayuran.Class.db
import com.uti.panduansuksesbertanisayuran.R
import com.uti.panduansuksesbertanisayuran.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    // Deklarasi binding untuk data Helper
    private lateinit var databaseHelper: db

    //    deklarasi sharePref
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //   variabel binding untuk LoginActivity
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    //  binding data helper
        databaseHelper = db(this)
        sharedPref = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}