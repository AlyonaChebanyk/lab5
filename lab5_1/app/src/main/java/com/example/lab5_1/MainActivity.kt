package com.example.lab5_1

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circles = arrayListOf<RandomCircle>()
        for (c in 1..50) {
            circles.add(
                RandomCircle(
                    Random.nextInt(100),
                    Color.argb(200, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
                )
            )
        }

        val adapter = CircleAdapter(circles)
        recyclerView.layoutManager = GridLayoutManager(this, 4)
        recyclerView.adapter = adapter
    }
}
