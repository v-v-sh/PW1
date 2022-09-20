package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



val a = 2
val b = 3
val c = 4

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(a*b*c)
    }
}