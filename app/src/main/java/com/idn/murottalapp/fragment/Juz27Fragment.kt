package com.idn.murottalapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.murottalapp.adapter.ListSurahAdapter
import com.idn.murottalapp.data.DataSurah.listSurah27
import com.idn.murottalapp.data.ListSurah
import com.idn.murottalapp.databinding.FragmentJuz27Binding
import com.idn.murottalapp.utils.MediaService.Companion.init
import com.idn.murottalapp.utils.MediaService.Companion.playPause
import com.idn.murottalapp.utils.OnItemClickCallback
import com.idn.murottalapp.ListSurahActivity
import com.idn.murottalapp.R
import com.idn.murottalapp.utils.MediaService.Companion.playSurah

class Juz27Fragment: Fragment() {

    private var _binding: FragmentJuz27Binding? = null
    private val binding get() = _binding as FragmentJuz27Binding
    // private var prevPlay: Int? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentJuz27Binding.inflate(inflater, container, false)
        binding.rvJuz27.apply {
            layoutManager = LinearLayoutManager(activity)
            val surahAdapter = ListSurahAdapter(listSurah27)
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