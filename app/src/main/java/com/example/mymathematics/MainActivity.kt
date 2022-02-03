package com.example.mymathematics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.mathematics_util.ArithmeticOperation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("Sum1", ArithmeticOperation().addNumbers(10,20).toString())
        Log.e("Sum2", ArithmeticOperation().addNumbersMessage(25,25))

        Toast.makeText(this,ArithmeticOperation().addNumbersMessage(25,25),Toast.LENGTH_LONG).show()
    }
}