package com.example.lab5_1

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*


class CircleViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
    fun bind(circle: RandomCircle){
        val strokeWidth = 5
        val strokeColor = Color.parseColor("#000000")
        val fillColor = circle.color
        val gD = GradientDrawable()
        gD.setColor(fillColor)
        gD.shape = GradientDrawable.OVAL
        gD.setStroke(strokeWidth, strokeColor)
        view.textView.apply {
             background = gD
             text = circle.number.toString()
        }

        view.setOnClickListener {
            val builder = AlertDialog.Builder(view.context)
            builder.setTitle("Number")
            builder.setMessage("You choose number: ${circle.number}")

            builder.setPositiveButton(android.R.string.yes, null)
            builder.show()
        }

    }
}