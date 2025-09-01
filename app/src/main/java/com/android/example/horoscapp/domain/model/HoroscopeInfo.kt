package com.android.example.horoscapp.domain.model

import com.android.example.horoscapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int) {
    object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    object Taurus:HoroscopeInfo(R.drawable.tauro, R.string.Taurus)
    object Gemini:HoroscopeInfo(R.drawable.geminis, R.string.Gemini)
    object Cancer:HoroscopeInfo(R.drawable.cancer, R.string.Cancer)
    object Leo:HoroscopeInfo(R.drawable.leo, R.string.Leo)
    object Virgo:HoroscopeInfo(R.drawable.virgo, R.string.Virgo)
    object Libra:HoroscopeInfo(R.drawable.libra, R.string.Libra)
    object Scorpio:HoroscopeInfo(R.drawable.escorpio, R.string.Scorpio)
    object Sagittarius:HoroscopeInfo(R.drawable.sagitario, R.string.Sagittarius)
    object Capricorn:HoroscopeInfo(R.drawable.capricornio, R.string.Capricorn)
    object Aquarius:HoroscopeInfo(R.drawable.aquario, R.string.Aquarius)
    object Pisces:HoroscopeInfo(R.drawable.piscis, R.string.Pisces)
}