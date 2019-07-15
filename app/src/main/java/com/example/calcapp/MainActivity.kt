package com.example.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

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

        val a : Int = Integer.parseInt(text1)
        val b : Int = Integer.parseInt(text2)

        if(v!=null){
            if(v.id==R.id.button1) {
                textView.text = "${a + b}"
            } else if(v.id==R.id.button2) {
                textView.text = "${a - b}"
            }else if(v.id==R.id.button3) {
                textView.text = "${a * b}"
            }else if(v.id==R.id.button4) {
                textView.text = "${a / b}"
            }

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE", "textView.text")
            startActivity(intent)
        }
    }
}