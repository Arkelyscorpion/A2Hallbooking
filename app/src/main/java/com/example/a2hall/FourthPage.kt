package com.example.a2hall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_page)
        //val nextButton = findViewById<Button>(R.id.button6)
        val backButton = findViewById<Button>(R.id.button7)

        /*nextButton?.setOnClickListener()
        {
            //intent is used to link one page to another
            val intent = Intent(this, SecondaryDetails::class.java)
            // start your next activity
            startActivity(intent)          }*/

        backButton?.setOnClickListener(){
            val intent = Intent(this, SecondaryDetails::class.java)
            startActivity(intent)
        }
    }
}