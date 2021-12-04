package com.idn.murottalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.idn.murottalapp.adapter.SectionPagerAdapter
import com.idn.murottalapp.databinding.ActivityListSurahBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.idn.murottalapp.utils.MediaService.Companion.activityBinding
import com.idn.murottalapp.utils.MediaService.Companion.getSurahName
import com.idn.murottalapp.utils.MediaService.Companion.mp
import com.idn.murottalapp.utils.MediaService.Companion.stop
class ListSurahActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListSurahBinding
    private var doubleBackToExitOnce: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListSurahBinding.inflate(layoutInflater)
        activityBinding = binding
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.apply {
            title = when(mp) {
                null -> getString(R.string.app_name)
                else -> getString(R.string.playing, getSurahName())
            }
        }

        binding.vpList.adapter = SectionPagerAdapter(this)

        val tabList = arrayOf("Juz 30", "Juz 29", "Juz 27")
        TabLayoutMediator(binding.tabs, binding.vpList) { tab, position ->
            tab.text = tabList[position]
        }.attach()

        binding.fab.setOnClickListener {
            stop()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.surah_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        if(doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true

        Toast.makeText(this.applicationContext, getString(R.string.confirm_exit), Toast.LENGTH_SHORT).show()
        Handler(Looper.getMainLooper()).postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}