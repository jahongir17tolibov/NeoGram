package com.jt17.neogram.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.jt17.neogram.Chat
import com.jt17.neogram.Profile
import com.jt17.neogram.R
import com.jt17.neogram.models.ItemModel

class HomeAdapter(val list: List<ItemModel>, val onCallBack: AdapterCallBack) :
    RecyclerView.Adapter<HomeAdapter.ItemHolder>() {

    inner class ItemHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val holder =
            ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ly, parent, false))
        return holder
    }


    @SuppressLint("CutPasteId", "NotifyDataSetChanged", "ResourceType")
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

            intent.putExtra("key", itemData)

            holder.itemView.context.startActivity(intent)

        }

        if (itemData.pos) {
            holder.itemView.findViewById<TextView>(R.id.soat).visibility = View.GONE
            holder.itemView.findViewById<ImageView>(R.id.checkordouble).visibility = View.GONE
            holder.itemView.findViewById<ImageView>(R.id.delete_btn).visibility = View.VISIBLE
        } else {
            holder.itemView.findViewById<TextView>(R.id.soat).visibility = View.VISIBLE
            holder.itemView.findViewById<ImageView>(R.id.checkordouble).visibility = View.VISIBLE
            holder.itemView.findViewById<ImageView>(R.id.delete_btn).visibility = View.GONE
        }

        holder.itemView.findViewById<RelativeLayout>(R.id.realive).setOnLongClickListener {
            Toast.makeText(holder.itemView.context, "Iwladi", Toast.LENGTH_SHORT).show()
            itemData.pos = true
            notifyDataSetChanged()
            true
        }

        if (itemData.pos) {
            holder.itemView.findViewById<RelativeLayout>(R.id.realive).setOnLongClickListener {
                Toast.makeText(holder.itemView.context, "Bunisiyam iwladi", Toast.LENGTH_SHORT)
                    .show()
                itemData.pos = false
                notifyDataSetChanged()
                true
            }
        }
        holder.itemView.findViewById<ImageView>(R.id.delete_btn).setOnClickListener {
            onCallBack.itemClick(position)
        }

    }

    override fun getItemCount(): Int = list.size

    interface AdapterCallBack {
        fun itemClick(a: Int)
    }

}