package com.idn.murottalapp.adapter

import android.content.Intent
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.idn.murottalapp.data.ListSurah
import com.idn.murottalapp.ListSurahActivity
import com.idn.murottalapp.databinding.RowItemSurahBinding
import com.idn.murottalapp.utils.MediaService.Companion.playSurah
import com.idn.murottalapp.utils.OnItemClickCallback

class ListSurahAdapter(private val listSurah: ArrayList<ListSurah>) :
    RecyclerView.Adapter<ListSurahAdapter.MyViewHolder>() {

    //private var onItemClicked: OnItemClickCallback? = null

    inner class MyViewHolder(private val itemSurahBinding: RowItemSurahBinding):
        RecyclerView.ViewHolder(itemSurahBinding.root) {
        fun bindItem(surah: ListSurah) {
            itemSurahBinding.tvSurah.text = surah.name
            itemSurahBinding.tvSurahArabic.text = surah.name_arabic
            itemSurahBinding.tvOrigin.text = surah.origin
            itemSurahBinding.tvAmount.text = surah.amount.toString()
            itemSurahBinding.tvNumber.text = surah.numbers.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =  MyViewHolder(
        RowItemSurahBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(listSurah[position])
        holder.itemView.setOnClickListener {
            playSurah(it.context,listSurah[position])
            //onItemClicked?.onItemClicked(listSurah[position])
        }
    }

    override fun getItemCount() = this.listSurah.size

//    fun setOnItemClickCallback(onItemClicked: OnItemClickCallback) {
//        this.onItemClicked = onItemClicked
//    }
}