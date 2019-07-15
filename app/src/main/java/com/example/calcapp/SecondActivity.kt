package com.example.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)

        button1.setOnClickListener {
            textView.text = "${value1 + value2}"
        }

        button2.setOnClickListener {
            textView.text = "${value1 - value2}"
        }

        button3.setOnClickListener {
            textView.text = "${value1 * value2}"
        }

        button4.setOnClickListener {
            textView.text = "${value1 / value2}"
        }

    }
}