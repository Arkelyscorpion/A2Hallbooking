package com.example.a2hall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        /*
        operations to be performed
        when user tap on the button
        */
        button?.setOnClickListener()
        {
            //intent is used to link one page to another
            val intent = Intent(this, BasicDetails::class.java)
            // start your next activity
            startActivity(intent)          }
    }
}