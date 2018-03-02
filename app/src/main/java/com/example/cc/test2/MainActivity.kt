package com.example.cc.test2

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() ,View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var t = findViewById<TextView>(R.id.t)
        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var t2 = findViewById<TextView>(R.id.t2)

        b1.setOnClickListener(){
            t.setText("Greet");
            b2.setBackgroundColor(Color.RED);
        }
        b2.setOnClickListener(this)
    }

    override  fun onClick(v: View?){
        var t = findViewById<TextView>(R.id.t)
        t.setText("OOOOO")
    }
}
