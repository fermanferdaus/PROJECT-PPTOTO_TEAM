package com.uti.panduansuksesbertanisayuran.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.uti.panduansuksesbertanisayuran.Class.db
import com.uti.panduansuksesbertanisayuran.R
import com.uti.panduansuksesbertanisayuran.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
        private lateinit var databaseHelper: db

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//  Binding SignupActivity
        val binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

//  Binding Database
        databaseHelper = db(this)



        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}