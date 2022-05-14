package com.tminus1010.pg_flightsearch.data.service

import kotlinx.coroutines.flow.Flow
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ITequilaAPI {
//    @GET("v2/search?")
    @GET("locations/query")
    @Headers("Content-Type: application/json; charset=UTF-8")
    fun search(
        @Header("apikey") token: String,
        @Query("fly_from") cityName: String,
        @Query("term") term: String,
    ): Flow<ResponseBody>
}