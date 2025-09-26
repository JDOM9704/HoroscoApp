package com.android.example.horoscapp.data

import android.util.Log
import com.android.example.horoscapp.data.network.HoroscopeApiService
import com.android.example.horoscapp.data.network.response.PredictionResponse
import com.android.example.horoscapp.domain.model.model.PredictionModel
import com.android.example.horoscapp.domain.model.model.Repository
import retrofit2.Retrofit
import javax.inject.Inject


class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Juancho", "Ha ocurrido un error ${it.message}") }
        return null
    }
}