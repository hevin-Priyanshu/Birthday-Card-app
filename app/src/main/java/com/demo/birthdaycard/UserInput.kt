package com.demo.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UserInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_input)

        val receivedValue = intent.getStringExtra("editView")

        val userName: TextView = findViewById(R.id.userName)
        userName.text = receivedValue
    }
}