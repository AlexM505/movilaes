package com.tda.movilaes.ui

import android.os.Bundle
import com.tda.movilaes.R
import com.tda.movilaes.base.BaseActivity
import com.tda.movilaes.ui.fragments.CustomersFragment
import com.tda.movilaes.ui.fragments.LoginFragment
import com.tda.movilaes.ui.fragments.NewsFragment
import com.tda.movilaes.ui.fragments.ReportsFragment
import kotlinx.android.synthetic.main.activity_main.*
import me.ibrahimsn.lib.OnItemSelectedListener

class MainActivity : BaseActivity() {

    private val CUSTOMERS = 0
    private val REPORTS = 1
    private val NEWS = 2
    private val ACCOUNT = 3

    override fun getViewID(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        moveToFragment(CustomersFragment())

        bottomBar.setOnItemSelectedListener(object: OnItemSelectedListener {
            override fun onItemSelect(pos: Int) {
                when(pos){
                    CUSTOMERS ->{
                        clearBackStack()
                        moveToFragment(CustomersFragment())
                    }
                    REPORTS ->{
                        clearBackStack()
                        moveToFragment(ReportsFragment())
                    }
                    NEWS ->{
                        clearBackStack()
                        moveToFragment(NewsFragment())
                    }
                    ACCOUNT ->{
                        moveToFragment(LoginFragment())
                    }
                }
            }
        })
    }


}
