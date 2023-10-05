package com.example.monappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t = (TextView)findViewById(R.id.textView);
        t.setOnClickListener(this);
    }

    override fun onClick(v: View?) {
        Toast.makeText(applicationContext, "Bouton cliqué!", Toast.LENGTH_SHORT).show()
    }
}