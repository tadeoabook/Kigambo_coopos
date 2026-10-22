package com.kigambo.coopos
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Kigambo CoopOS\nFrom Kigambo Sub County, Kyegegwa\nBuild Success!"
        tv.textSize = 22f
        tv.setPadding(50,150,50,50)
        setContentView(tv)
    }
}
