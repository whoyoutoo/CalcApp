package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        var a: Double = text1.toDouble()
        var b: Double = text2.toDouble()

        var sum: Double = 0.0

        try {
            text1.count() == 0
        } catch (e: Exception) {
            Snackbar.make(editText1, "Put in", Snackbar.LENGTH_INDEFINITE)
            Snackbar.make(editText2, "Put in", Snackbar.LENGTH_INDEFINITE)
        }

        try {
            text2.count() == 0
        } catch (e: Exception) {
            Snackbar.make(editText1, "Put in", Snackbar.LENGTH_INDEFINITE)
            Snackbar.make(editText2, "Put in", Snackbar.LENGTH_INDEFINITE)
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
