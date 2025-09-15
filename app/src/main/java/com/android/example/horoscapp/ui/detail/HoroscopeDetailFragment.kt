package com.android.example.horoscapp.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.example.horoscapp.R
import com.android.example.horoscapp.databinding.FragmentHoroscopeDetailBinding
import com.android.example.horoscapp.databinding.FragmentLuckBinding


class HoroscopeDetailFragment : Fragment() {

    private var _biding: FragmentHoroscopeDetailBinding? = null
    private val binding get() = _biding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _biding = FragmentHoroscopeDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}