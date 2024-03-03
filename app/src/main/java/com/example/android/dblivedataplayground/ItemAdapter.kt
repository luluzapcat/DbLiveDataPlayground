package com.example.android.dblivedataplayground

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ItemAdapter: RecyclerView.Adapter<RvItemViewHolder>() {

    var data : MutableList<Item> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.rv_item,parent,false) as TextView
        val viewHolder = RvItemViewHolder(view)
        return viewHolder    }

    override fun onBindViewHolder(holder: RvItemViewHolder, position: Int) {
        val item = data.get(position) // for db
        holder.textView.text = item.name
        holder.textView.tag = position
    }

    override fun getItemCount(): Int {
        return data.size
    }
}


class RvItemViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView) {
}
