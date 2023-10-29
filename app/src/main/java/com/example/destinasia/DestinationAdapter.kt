package com.example.destinasia

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class DestinationAdapter(private val destinations: List<Destination>, private val context: Context) :
    RecyclerView.Adapter<DestinationAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgDestinasi: ImageView = itemView.findViewById(R.id.iv_item)
        val textDestinasi: TextView = itemView.findViewById(R.id.tv_item_name)
        val textDeskripsi: TextView = itemView.findViewById(R.id.tv_item_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_destinasi, parent, false)
        return ListViewHolder(view)
    }

    override fun  getItemCount(): Int = destinations.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (destination, description, photo) = destinations[position]
        holder.imgDestinasi.setImageResource(photo)
        holder.textDestinasi.text = destination
        holder.textDeskripsi.text = description
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Anda Memilih $destination", Toast.LENGTH_SHORT).show()
            val intent_detail = Intent(context, DetailActivity::class.java)
            intent_detail.putExtra(MainActivity.EXTRA_DESTINATION, destinations[position])
            context.startActivity(intent_detail)
        }
    }
}