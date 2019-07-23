package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        var text1 = editText1.text.toString();
        var text2 = editText2.text.toString();

        var a = 0.0
        var b = 0.0

        var sum: Double = 0.0

        try {
            a = text1.toDouble()
            b = text2.toDouble()
        } catch (e: Exception) {
            Snackbar.make(editText1, "Put in", Snackbar.LENGTH_INDEFINITE)
                .show()
            return
        }


        if (v != null) {
            if (v.id == R.id.button1) {
                sum = a + b
            } else if (v.id == R.id.button2) {
                sum = a - b
            } else if (v.id == R.id.button3) {
                sum = a * b
            } else if (v.id == R.id.button4) {
                sum = a / b
            }

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("sum", sum)
            startActivity(intent)
        }
    }
}