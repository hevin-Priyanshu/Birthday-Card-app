package com.demo.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editTextText)
        val getBtn: Button = findViewById(R.id.getButton)

        getBtn.setOnClickListener {

            val editView = editText.text.toString()

            val intent = Intent(this, UserInput::class.java)
            intent.putExtra("editView", editView)
            startActivity(intent)

            editText.text.clear()
        }


    }
}