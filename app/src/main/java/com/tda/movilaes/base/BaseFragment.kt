package com.tda.movilaes.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.tda.movilaes.R


abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanseState: Bundle?
    ): View? {
        return provideYourFragmentView(inflater, parent, savedInstanseState)
    }

    abstract fun provideYourFragmentView(inflater: LayoutInflater?, parent: ViewGroup?, savedInstanceState: Bundle?): View

    fun addFragment(newFragment: Fragment, nameBackStack:String) {
        val transaction = activity!!.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newFragment)
        transaction.addToBackStack(nameBackStack)
        transaction.commit()
    }

    fun popStack(tag: String) {
        var isPopped =  activity!!.supportFragmentManager.popBackStackImmediate(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        if (!isPopped) {
            activity!!.supportFragmentManager.popBackStack()
        }
    }

    fun clearBackStack() {
        val backStackEntry: Int = activity!!.supportFragmentManager.backStackEntryCount
        if (backStackEntry > 0) {
            for (i in 0 until backStackEntry) {
                activity!!.supportFragmentManager.popBackStackImmediate()
            }
        }
        //Here we are removing all the fragment that are shown here
        if (activity!!.supportFragmentManager.fragments != null && activity!!.supportFragmentManager.fragments.size > 0) {
            for (i in 0 until activity!!.supportFragmentManager.fragments.size) {
                val mFragment: Fragment =
                    activity!!.supportFragmentManager.fragments.get(i)
                if (mFragment != null) {
                    activity!!.supportFragmentManager.beginTransaction().remove(mFragment).commit()
                }
            }
        }
    }
}