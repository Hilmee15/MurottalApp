package com.idn.murottalapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.murottalapp.fragment.Juz27Fragment
import com.idn.murottalapp.fragment.Juz29Fragment
import com.idn.murottalapp.fragment.Juz30Fragment

class SectionPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Juz30Fragment()
            1 -> Juz29Fragment()
            2 -> Juz27Fragment()
            else -> Juz30Fragment()
        }
    }
}