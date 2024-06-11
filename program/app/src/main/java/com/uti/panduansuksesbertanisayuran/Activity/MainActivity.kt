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
import com.uti.panduansuksesbertanisayuran.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //    deklarasi binding databaseHelper dan sharedPref
    private lateinit var databaseHelper: db
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Buat variabel binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Binding database
        databaseHelper = db(this)
        sharedPref = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

        // Buat event menu
        binding.cdMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        // Buat event profil
        binding.cdProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }

        // Buat event Logout
        binding.cdOut.setOnClickListener {
            // Hapus username dari SharedPreferences
            with(sharedPref.edit()) {
                remove("logged_in_user")
                apply()
            }
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Ambil nama pengguna dari SharedPreferences dan tampilkan
        val username = getLoggedInUsername()
        binding.textUsername.text = username

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun getLoggedInUsername(): String {
        // Ambil username dari SharedPreferences
        return sharedPref.getString("logged_in_user", "Guest") ?: "Guest"
    }
}
