package com.kigambo.coopos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.view.Gravity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Kigambo CoopOS\n\nWelcome! App is working ✅"
        tv.textSize = 22f
        tv.gravity = Gravity.CENTER
        tv.setPadding(50, 200, 50, 50)
        setContentView(tv)
    }
}
