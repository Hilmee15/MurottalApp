package com.idn.murottalapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.murottalapp.R
import com.idn.murottalapp.adapter.ListSurahAdapter
import com.idn.murottalapp.data.DataSurah.listSurah30
import com.idn.murottalapp.data.ListSurah
import com.idn.murottalapp.databinding.FragmentJuz30Binding
import com.idn.murottalapp.utils.MediaService
import com.idn.murottalapp.utils.MediaService.Companion.init
import com.idn.murottalapp.utils.MediaService.Companion.playPause
import com.idn.murottalapp.utils.MediaService.Companion.playSurah
import com.idn.murottalapp.utils.OnItemClickCallback

class Juz30Fragment: Fragment() {

    private var _binding: FragmentJuz30Binding? = null
    private val binding get() = _binding as FragmentJuz30Binding
    // private var prevPlay: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentJuz30Binding.inflate(inflater, container, false)
        binding.rvJuz30.apply {
            layoutManager = LinearLayoutManager(activity)
            val surahAdapter = ListSurahAdapter(listSurah30)
//            surahAdapter.setOnItemClickCallback(object : OnItemClickCallback {
//                override fun onItemClicked(surah: ListSurah) {
////                    if (prevPlay != surah.numbers) {
////                        prevPlay = surah.numbers
////                        init(requireContext(), surah.file, surah.name)
////                    }
////                    playPause()
//                    playSurah(requireContext(), surah,getString(R.string.playing))
//                }
//            })
            adapter = surahAdapter
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}