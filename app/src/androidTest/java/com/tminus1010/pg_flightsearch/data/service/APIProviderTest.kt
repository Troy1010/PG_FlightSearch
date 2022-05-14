package com.tminus1010.pg_flightsearch.data.service

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.tminus1010.pg_flightsearch.data.FlightsRepo
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class APIProviderTest {
    @Test
    fun getTequilaAPI() = runBlocking {
        // # Given
        val flightsRepo = FlightsRepo()
        // # When & Then
        flightsRepo.getIataCode("London")
            .collect { Log.d("FS", "value:$it") }
    }
}