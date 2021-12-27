package com.example.a2hall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BasicDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_details)

        val nextButton = findViewById<Button>(R.id.button2)
        val backButton = findViewById<Button>(R.id.button3)

        /*
        operations to be performed
        when user tap on the button
        */
        nextButton?.setOnClickListener()
        {
            //intent is used to link one page to another
            val intent = Intent(this, SecondaryDetails::class.java)
            // start your next activity
            startActivity(intent)          }

        backButton?.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}