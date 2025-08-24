package com.android.example.horoscapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.example.horoscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    private var _biding: FragmentHoroscopeBinding? = null
    private val binding get() = _biding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _biding = FragmentHoroscopeBinding.inflate(inflater, container, false)
        return binding.root
    }

}