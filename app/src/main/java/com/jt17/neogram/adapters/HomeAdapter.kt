package com.jt17.neogram.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jt17.neogram.Chat
import com.jt17.neogram.Profile
import com.jt17.neogram.R
import com.jt17.neogram.models.ItemModel

class HomeAdapter(val list: List<ItemModel>) : RecyclerView.Adapter<HomeAdapter.ItemHolder>() {

    inner class ItemHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val holder =
            ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ly, parent, false))
        return holder
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val itemData = list[position]

        holder.itemView.findViewById<ImageView>(R.id.persons).setImageResource(itemData.profile_img)
        holder.itemView.findViewById<TextView>(R.id.text_bigger).text = itemData.top_txt
        holder.itemView.findViewById<TextView>(R.id.text_smaller).text = itemData.bottom_txt
        holder.itemView.findViewById<TextView>(R.id.soat).text = itemData.clock
        holder.itemView.findViewById<ImageView>(R.id.checkordouble)
            .setImageResource(itemData.checher)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Chat::class.java)

            intent.putExtra("key1", itemData.top_txt)
            intent.putExtra("key2", itemData.profile_img)
            intent.putExtra("key3",itemData.bottom_txt)
            intent.putExtra("key4",itemData.clock)

            holder.itemView.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int = list.size

}