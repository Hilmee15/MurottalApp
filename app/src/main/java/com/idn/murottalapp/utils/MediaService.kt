package com.idn.murottalapp.utils

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Build
import android.view.View
import com.idn.murottalapp.R
import com.idn.murottalapp.data.ListSurah
import com.idn.murottalapp.databinding.ActivityListSurahBinding
import java.io.IOException
import kotlin.concurrent.thread

class MediaService {

    companion object {
        var mp: MediaPlayer? = null
        var activityBinding : ActivityListSurahBinding? = null
        val activityContext get() = activityBinding?.root?.context!!
        private var prevPlay: String? = null
        // val stopBtn get() = activityBinding?.toolbar?.menu?.findItem(R.id.btn_stop)
        // var isReady: Boolean = false

        /* fun play(surah: String, context: Context) {
            val filename = "android.resource://" + context.getPackageName() + "/raw/" + surah
            mp?.setDataSource(context, Uri.parse(filename))
            mp?.prepare()
            mp?.start()
        }

        fun resume() {
            mp?.start()
        }

        fun pause() {
            mp?.pause()
        }

        fun stop() {
            mp?.stop()
            mp?.reset()
        } */

        /* fun init(context: Context, surah: Int) {
            mp = MediaPlayer()

            val mAudioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()

            mp?.setAudioAttributes(mAudioAttributes)

            val afd = context.resources.openRawResourceFd(surah)
            try {
                mp?.setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
            }catch (exc: IOException){
                exc.printStackTrace()
            }

            mp?.setOnPreparedListener {
                isReady = true
                mp?.start()
                // showNotification()
            }

            mp?.setOnErrorListener { _, _, _ ->
                false
            }
        }

        fun play() {
            if (!isReady){
                mp?.prepareAsync()
                //merubah text btn play -> pause
                // btn_play.text = getString(R.string.pause)
            }else{
                if (mp?.isPlaying as Boolean){
                    mp?.pause()
                    //merubah text btn pause -> play
                    //btn_play.text = getString(R.string.play)
                }else{
                    mp?.start()
                    //merubah text btn play -> pause
                    //btn_play.text = getString(R.string.pause)
                    // showNotification()
                }
            }
        }

        fun stop() {
            if (mp?.isPlaying as Boolean || isReady){
                mp?.stop()
                isReady = false
                //merubah text btn pause -> play
                // btn_play.text = getString(R.string.play)
                // stopNotification()
            }
        }

        fun onChanged(context: Context, surah: Int) {
            if (mp?.isPlaying as Boolean) {
                mp?.pause()
                mp?.reset()
            }

            Thread(Runnable {
                val afd = context.resources.openRawResourceFd(surah)
                try {
                    mp?.setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                }catch (exc: IOException){
                    exc.printStackTrace()
                }
            }).start()
        } */

        fun init(context: Context, surah: Int, name: String) {
            mp?.stop()
            mp?.release()
            mp = MediaPlayer.create(context, surah)
            mp?.isLooping = true
            activityBinding?.toolbar?.title = activityContext.getString(R.string.playing,name)
            /* if (stopBtn != null) {
                stopBtn?.setVisible(true)
            } */
            activityBinding?.fab?.visibility = View.VISIBLE
        }

        fun playPause() {
            if (mp != null && mp?.isPlaying as Boolean) {
                mp?.pause()
            } else {
                mp?.start()
            }
        }

        fun stop() {
            mp?.stop()
            mp?.release()
            mp = null
            prevPlay = null
            /* if (stopBtn != null) {
                stopBtn?.setVisible(false)
            } */
            activityBinding?.fab?.visibility = View.GONE
            activityBinding?.toolbar?.title = activityContext.getString(R.string.app_name)
        }

        /* fun nextSurah(context: Context, surah: ListSurah) {
            TODO("Implementasi Next, Previous dan Repeat")
            mp?.stop()
            mp?.release()
            mp = MediaPlayer.create(context, )
        } */

        fun playSurah(context: Context, surah: ListSurah) {
            if (prevPlay != surah.name) {
                prevPlay = surah.name
                init(context, surah.file, surah.name)
            }
            playPause()
        }
        fun getSurahName() : String {
            return prevPlay!!
        }
    }
}