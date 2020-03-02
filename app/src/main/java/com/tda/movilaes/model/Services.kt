package com.tda.movilaes.model

import com.tda.movilaes.R


class Services(val icon: Int, val text: String) {

    companion object {

        fun getList(): List<Services> {
            val servicesList = ArrayList<Services>()
            servicesList.clear()
            servicesList.add(Services(R.drawable.service_customer, "Atencion al cliente"))
            servicesList.add(Services(R.drawable.service_screen, "Servicio de autogestion"))
            servicesList.add(Services(R.drawable.service_irregularity, "Atencion de irregularidades"))
            servicesList.add(Services(R.drawable.service_clients, "Grandes clientes"))
            servicesList.add(Services(R.drawable.service_payment, "Pago de servicios"))

            return servicesList
        }
    }
}