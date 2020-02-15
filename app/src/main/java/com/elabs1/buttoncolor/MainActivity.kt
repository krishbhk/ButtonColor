package com.elabs1.buttoncolor

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    fun getRandomColor(): Int {
        val rnd = Random()
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    }
    fun sizeRandom():Int {
        val r = Random()
        val num = r.nextInt(150)
        return num
    }
    fun rotate():Int {
        val rnd = Random()
        val n = rnd.nextInt(360)
        return n
    }

    fun xpos():Int{
        val r = Random()
        val n = r.nextInt(100)
        return n
    }
    fun ypos():Int{
        val r = Random()
        return r.nextInt(100)
        //return n
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1: Button = findViewById(R.id.b1)
        val t1: TextView = findViewById(R.id.t1)
        val anim: Animation = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 50
        anim.startOffset = 20

        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = Animation.INFINITE
        t1.startAnimation(anim)
        b1.setOnClickListener {

            b1.setBackgroundColor(getRandomColor())

            val n = sizeRandom().toFloat()    // java.float to kt.float
            t1.textSize = n
            val num: Float = rotate().toFloat() // java.float to kt.float
            t1.rotation = num
            t1.x = xpos().toFloat()
            t1.y = ypos().toFloat()

        }

    }
}
