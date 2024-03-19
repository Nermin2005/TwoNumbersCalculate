package com.example.twonumberscalculate

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var result=findViewById<EditText>(R.id.resultEditText)
        var additionButton=findViewById<Button>(R.id.button1)
        var subtractionButton=findViewById<Button>(R.id.button2)
        var multiplicationButton=findViewById<Button>(R.id.button3)
        var divisionButton=findViewById<Button>(R.id.button4)
    additionButton.setOnClickListener {
       var resultEditText=Calculate('+')
        result.setText(resultEditText.toString())

    }
        subtractionButton.setOnClickListener {
            var resultEditText=Calculate('-')
            result.setText(resultEditText.toString())

        }
        multiplicationButton.setOnClickListener {
            var resultEditText=Calculate('*')
            result.setText(resultEditText.toString())

        }
        divisionButton.setOnClickListener {
            var resultEditText=Calculate('/')
            result.setText(resultEditText.toString())

        }
    }

    fun Calculate(operator:Char) :Double{
        val firstNumberText = findViewById<EditText>(R.id.TextNumber1).text.toString()
        val secondNumberText = findViewById<EditText>(R.id.TextNumber2).text.toString()

        val firstNumber = firstNumberText.toDouble()
        val secondNumber = secondNumberText.toDouble()
       return when {
            operator=='+'->firstNumber+secondNumber
            operator=='-'-> firstNumber-secondNumber
            operator=='*'->firstNumber*secondNumber
            operator=='/'->firstNumber/secondNumber
            else -> Double.NaN
        }


    }
}
