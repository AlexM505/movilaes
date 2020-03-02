package com.tda.movilaes.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tda.movilaes.R
import com.tda.movilaes.base.BaseFragment
import com.tda.movilaes.ui.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_customers.*
import kotlinx.android.synthetic.main.toolbar.*


class CustomersFragment : BaseFragment() {

    override fun provideYourFragmentView(
        inflater: LayoutInflater?,
        parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater!!.inflate(R.layout.fragment_customers, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbarTittle.text = "Gestiones"

        val adapter = ViewPagerAdapter(activity!!.supportFragmentManager)
        adapter.addFragment(CustomerServiceFragment(), "Atencion de Gestiones")
        adapter.addFragment(PaymentPointsFragment(), "Puntos de pago")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }

}
