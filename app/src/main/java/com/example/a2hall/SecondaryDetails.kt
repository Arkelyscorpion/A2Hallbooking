package com.example.a2hall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondaryDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary_details)

        val nextButton = findViewById<Button>(R.id.button4)
        val backButton = findViewById<Button>(R.id.button5)

        /*
        operations to be performed
        when user tap on the button
        */
        nextButton?.setOnClickListener()
        {
            //intent is used to link one page to another
            val intent = Intent(this, FourthPage::class.java)
            // start your next activity
            startActivity(intent)          }

        backButton?.setOnClickListener(){
            val intent = Intent(this,BasicDetails::class.java)
            startActivity(intent)
        }
    }
}