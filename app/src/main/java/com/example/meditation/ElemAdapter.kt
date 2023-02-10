package com.example.meditation

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ElemAdapter (val con: Context, val list2:ArrayList<Elem>): RecyclerView.Adapter<ElemAdapter.Link>() {
    class Link(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image_di: ImageView = itemView.findViewById(R.id.patternimage)
        val title_di: TextView = itemView.findViewById(R.id.patterntitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElemAdapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.elem_item, parent, false)
        return Link(root)
    }

    override fun getItemCount(): Int {
        return list2.size
    }

    override fun onBindViewHolder(holder: Link, position: Int) {
        holder.image_di.setImageResource(list2[position].imageId)
        holder.title_di.setText(list2[position].title)
    }
}