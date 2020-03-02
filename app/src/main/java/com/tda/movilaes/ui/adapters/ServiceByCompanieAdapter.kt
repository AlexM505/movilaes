package com.tda.movilaes.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tda.movilaes.R
import com.tda.movilaes.model.ServiceByCompanie


class ServiceByCompanieAdapter(private val ServiceByCompanieList: ArrayList<ServiceByCompanie>) : RecyclerView.Adapter<ServiceByCompanieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_service_by_companie, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(ServiceByCompanieList[position])
    }

    override fun getItemCount(): Int {
        return ServiceByCompanieList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(servicesByCompanie: ServiceByCompanie) {

            val tvCity = itemView.findViewById<TextView>(R.id.tvTextCity)
            val ivIconCompanie = itemView.findViewById<ImageView>(R.id.ivIconCompanie)
            val rvIcon = itemView.findViewById<RecyclerView>(R.id.rvServicesIcon)

            tvCity.text = servicesByCompanie.city
            ivIconCompanie.setImageResource(servicesByCompanie.iconCompanie)

            val listIcon= ArrayList<Int>()
            listIcon.addAll(servicesByCompanie.iconsServices)
            rvIcon.layoutManager = LinearLayoutManager(itemView.context, RecyclerView.HORIZONTAL,false)
            rvIcon.adapter = IconServiceByCompanieAdapter(listIcon)

        }
    }
}

class IconServiceByCompanieAdapter(private val iconList: ArrayList<Int>) : RecyclerView.Adapter<IconServiceByCompanieAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_icon_service, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(iconList[position])
    }

    override fun getItemCount(): Int {
        return iconList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(icon: Int) {

            val ivIcon = itemView.findViewById<ImageView>(R.id.ivIconCompanieService)

            ivIcon.setImageResource(icon)
        }
    }
}