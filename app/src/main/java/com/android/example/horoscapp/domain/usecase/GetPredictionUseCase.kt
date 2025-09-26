package com.android.example.horoscapp.domain.usecase

import com.android.example.horoscapp.domain.model.model.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)
}