package com.example.videoreciver.firebase

import com.example.videoreciver.MainActivity
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class FirebaseListener : FirebaseMessagingService() {

    //private val mainActivity = MainActivity()

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)

        val videoUrl = remoteMessage.data["video"]
        //mainActivity.setVideo(videoUrl!!)

    }

    companion object {
        private const val TAG = "FCM Service"
    }
}