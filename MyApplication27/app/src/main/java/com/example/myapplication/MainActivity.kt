package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.input_field)
        val button = findViewById<Button>(R.id.submit_button)

        button.setOnClickListener {
            val inputText = editText.text.toString()
            Toast.makeText(this, "Вы ввели: $inputText", Toast.LENGTH_SHORT).show()
        }
    }
}
