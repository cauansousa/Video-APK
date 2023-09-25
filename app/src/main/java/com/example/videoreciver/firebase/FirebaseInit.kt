package com.example.videoreciver.firebase

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import com.example.videoreciver.request.RetrofitRequest
import com.google.firebase.FirebaseApp
import com.google.firebase.messaging.FirebaseMessaging

class FirebaseInit: Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        val retrofitRequest = RetrofitRequest()

        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.d(TAG, "Fetching FCM registration token failed", task.exception)
                return@addOnCompleteListener
            }
            // FCM registration token
            val token = task.result

            retrofitRequest.setToken(token, "FCM Token")

            val msg = "FCM Token: $token"
            Log.d(TAG, msg)
        }
    }
}