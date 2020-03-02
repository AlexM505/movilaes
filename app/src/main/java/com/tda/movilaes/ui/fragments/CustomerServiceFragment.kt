package com.tda.movilaes.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.tda.movilaes.R
import com.tda.movilaes.base.BaseFragment
import com.tda.movilaes.model.ServiceByCompanie
import com.tda.movilaes.model.Services
import com.tda.movilaes.ui.adapters.ServiceByCompanieAdapter
import com.tda.movilaes.ui.adapters.ServicesAdapter
import kotlinx.android.synthetic.main.fragment_customer_service.*


class CustomerServiceFragment : BaseFragment() {

    override fun provideYourFragmentView(
        inflater: LayoutInflater?,
        parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater!!.inflate(R.layout.fragment_customer_service, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayListServices()

        displayListServiceByCompanie()
    }

    private fun displayListServices() {
        val services = ArrayList<Services>()
        services.addAll(Services.getList())
        rvServices.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        rvServices.adapter = ServicesAdapter(services)
    }

    private fun displayListServiceByCompanie(){
        val listServiceByCompanie = ArrayList<ServiceByCompanie>()
        listServiceByCompanie.addAll(ServiceByCompanie.getListServicesByCompanie())
        rvServicesByCompanies.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL,false)
        rvServicesByCompanies.adapter = ServiceByCompanieAdapter(listServiceByCompanie)
    }

}
