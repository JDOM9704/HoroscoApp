package com.android.example.horoscapp.domain.model.model

import com.android.example.horoscapp.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign:String) : PredictionModel?
}