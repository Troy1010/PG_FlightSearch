package com.tminus1010.pg_flightsearch.data.service

import retrofit2.Retrofit
import tech.thdev.network.flowcalladapterfactory.FlowCallAdapterFactory

class APIProvider {
    val tequilaAPI =
        Retrofit.Builder()
            .addCallAdapterFactory(FlowCallAdapterFactory())
            .baseUrl("https://tequila-api.kiwi.com/")
            .build()
            .create(ITequilaAPI::class.java)
}