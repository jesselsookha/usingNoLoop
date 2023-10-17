package com.example.usingloops2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etNum: EditText? = null
    private var tvDisp: TextView? = null

    private var intSum: Int = 0
    private var dblAvg: Double = 0.0
    private var intCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum = findViewById(R.id.etNum)
        tvDisp = findViewById(R.id.tvDisplay)

        val btnCalc = findViewById<Button>(R.id.btnCalc)

        btnCalc.setOnClickListener {
            calculate()
        }
    }

    private fun calculate(){
        intSum = intSum + (etNum?.text.toString().toInt())
        intCount += 1
        dblAvg = (intSum / intCount).toDouble()

        tvDisp?.text = "Sum = " + intSum + "\nCount = " + intCount + "\nAverage = " + dblAvg
    }
}