package com.tda.movilaes.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.tda.movilaes.R
import com.tda.movilaes.base.BaseFragment
import com.tda.movilaes.ui.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_customers.*
import kotlinx.android.synthetic.main.fragment_customers.tabs
import kotlinx.android.synthetic.main.fragment_reports.*
import kotlinx.android.synthetic.main.toolbar.*

class ReportsFragment : BaseFragment() {

    override fun provideYourFragmentView(
        inflater: LayoutInflater?,
        parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater!!.inflate(R.layout.fragment_reports, parent, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbarTittle.text = "Reportes"

        val adapter = ViewPagerAdapter(activity!!.supportFragmentManager)
        adapter.addFragment(ReportsTheftFragment(), "Denuncias de hurto")
        adapter.addFragment(ReportsNetworkDangerFragment(), "Peligros en la red")
        viewPagerReports.adapter = adapter
        tabsReports.setupWithViewPager(viewPagerReports)
    }

}
