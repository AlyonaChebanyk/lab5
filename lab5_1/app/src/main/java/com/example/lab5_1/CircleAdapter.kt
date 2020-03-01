package com.example.lab5_1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CircleAdapter(private val circles: ArrayList<RandomCircle>) : RecyclerView.Adapter<CircleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CircleViewHolder =
        CircleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: CircleViewHolder, position: Int) {
        holder.bind(circles[position])
    }

    override fun getItemCount(): Int = circles.size
}