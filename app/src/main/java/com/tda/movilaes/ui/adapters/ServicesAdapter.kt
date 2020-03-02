package com.tda.movilaes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tda.movilaes.R
import com.tda.movilaes.model.Services


class ServicesAdapter(private val serviceList: ArrayList<Services>) : RecyclerView.Adapter<ServicesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_service, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(serviceList[position])
    }

    override fun getItemCount(): Int {
        return serviceList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(services: Services) {
            val textView = itemView.findViewById<TextView>(R.id.tvTextService)
            val imageView = itemView.findViewById<ImageView>(R.id.ivIcon)

            textView.text = services.text
            imageView.setImageResource(services.icon)
        }
    }
}