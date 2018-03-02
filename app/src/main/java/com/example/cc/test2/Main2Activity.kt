package com.example.cc.test2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var b = findViewById<Button>(R.id.button)

        b.setOnClickListener(){
            b.setText("Hi")
        }
    }
}
