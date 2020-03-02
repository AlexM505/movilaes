package com.tda.movilaes.model

import com.tda.movilaes.R


class ServiceByCompanie(val iconCompanie: Int, val city: String, val iconsServices:ArrayList<Int>) {

    companion object {

        fun getListServicesByCompanie(): List<ServiceByCompanie> {
            val companiesList = ArrayList<ServiceByCompanie>()
            companiesList.clear()
            companiesList.add(ServiceByCompanie(R.drawable.caess, "Aguilares",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.caess, "Apopa",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment,R.drawable.service_screen)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.caess, "Chalatenango",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.caess, "Las cascadas",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment,R.drawable.service_screen)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.caess, "San Salvador, Centro",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment,R.drawable.service_screen)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.caess, "San Salvador, Grandes Clientes",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment,R.drawable.service_clients)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.eeo, "La union",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.eeo, "San Miguel",
                arrayListOf(R.drawable.service_customer,R.drawable.service_clients,R.drawable.service_payment,R.drawable.service_screen,R.drawable.service_irregularity)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.deusem, "Puerta de oriente",
                arrayListOf(R.drawable.service_customer,R.drawable.service_clients,R.drawable.service_payment,R.drawable.service_screen,R.drawable.service_irregularity)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.clesa, "Metapan",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.clesa, "Santa ana",
                arrayListOf(R.drawable.service_customer,R.drawable.service_clients,R.drawable.service_payment,R.drawable.service_screen,R.drawable.service_irregularity)
            ))
            companiesList.add(ServiceByCompanie(R.drawable.clesa, "Sonsonate",
                arrayListOf(R.drawable.service_customer,R.drawable.service_payment,R.drawable.service_screen,R.drawable.service_irregularity)
            ))
            return companiesList
        }
    }
}