package com.uti.panduansuksesbertanisayuran.Activity

import android.content.Context
import android.content.Intent
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

    //  Event btnLogin
        binding.btnLogin.setOnClickListener {
            val username = binding.Username.text.toString()
            val password = binding.Password.text.toString()
            loginDatabase(username, password)
        }

    //  EventtxRegis
        binding.txRegis.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // Membaca username dan password dari SQlite
    private fun loginDatabase(username: String, password: String) {
}