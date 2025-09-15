package com.android.example.horoscapp.domain.model.model

import com.android.example.horoscapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int) {
    data object Aries: HoroscopeInfo(R.drawable.aries, R.string.aries)
    data object Taurus: HoroscopeInfo(R.drawable.tauro, R.string.Taurus)
    data object Gemini: HoroscopeInfo(R.drawable.geminis, R.string.Gemini)
    data object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.Cancer)
    data object Leo: HoroscopeInfo(R.drawable.leo, R.string.Leo)
    data object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.Virgo)
    data object Libra: HoroscopeInfo(R.drawable.libra, R.string.Libra)
    data object Scorpio: HoroscopeInfo(R.drawable.escorpio, R.string.Scorpio)
    data object Sagittarius: HoroscopeInfo(R.drawable.sagitario, R.string.Sagittarius)
    data object Capricorn: HoroscopeInfo(R.drawable.capricornio, R.string.Capricorn)
    data object Aquarius: HoroscopeInfo(R.drawable.aquario, R.string.Aquarius)
    data object Pisces: HoroscopeInfo(R.drawable.piscis, R.string.Pisces)
}