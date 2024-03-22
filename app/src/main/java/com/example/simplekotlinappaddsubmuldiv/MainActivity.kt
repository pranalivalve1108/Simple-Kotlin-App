package com.example.simplekotlinappaddsubmuldiv

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btn_add : Button
    lateinit var btn_sub : Button
    lateinit var btn_mul : Button
    lateinit var btn_div : Button

    lateinit var edit_a : EditText
    lateinit var edit_b : EditText

    lateinit var result_tv : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add = findViewById(R.id.btn_add)
        btn_sub = findViewById(R.id.btn_sub)
        btn_mul = findViewById(R.id.btn_mul)
        btn_div = findViewById(R.id.btn_div)

        edit_a = findViewById(R.id.edit_a)
        edit_b = findViewById(R.id.edit_b)

        result_tv = findViewById(R.id.result_tv)

        btn_add.setOnClickListener(this)
        btn_sub.setOnClickListener(this)
        btn_mul.setOnClickListener(this)
        btn_div.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = edit_a.text.toString().toDouble()
        var b = edit_b.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_mul ->{
                result = a*b
            }
            R.id.btn_div ->{
                result = a/b
            }
        }
        result_tv.text = "Result is: $result"
    }
}