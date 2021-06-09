package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordGenerator = PasswordGenerator()
        val generate = findViewById<Button>(R.id.bt_generate) as Button
        val pwd = findViewById<Button>(R.id.txt_password) as TextView
        val save = findViewById<Button>(R.id.bt_generate) as Button
        val q = findViewById<Button>(R.id.txt_password) as TextView

        generate.setOnClickListener{
            val password = passwordGenerator.generatePassword(12, "")
            pwd.text = password
        }

        save.setOnClickListener{

        }
    }
}