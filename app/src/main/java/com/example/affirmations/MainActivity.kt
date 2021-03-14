package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val textView: TextView = findViewById(R.id.textView)
        // textView.text = DataSource().loadAffirmations().size.toString()
    }


}