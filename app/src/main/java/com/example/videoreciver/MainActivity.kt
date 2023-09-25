package com.example.videoreciver

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.videoreciver.utils.VideoHelper
import com.example.videoreciver.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    private val videoHelper: VideoHelper = VideoHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        videoHelper.playVideo(binding.videoView, R.raw.speak)
    }

    fun setVideo(video: String){
        videoHelper.playVideo(binding.videoView, R.raw.speak)
    }

}
