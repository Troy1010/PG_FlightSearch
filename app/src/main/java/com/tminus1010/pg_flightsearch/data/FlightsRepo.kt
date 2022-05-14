package com.tminus1010.pg_flightsearch.data

import com.tminus1010.pg_flightsearch.BuildConfig
import com.tminus1010.pg_flightsearch.data.service.APIProvider
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Responsibility: Interact with external sources for Flights, without exposing implementation details like tokens or DTOs.
 */
class FlightsRepo {
    private val tequilaAPI = APIProvider().tequilaAPI
    fun getIataCode(city: String): Flow<String> {
        return tequilaAPI.search(BuildConfig.TOKEN, city, "PRG").map { it.string() }
    }
}