package com.example.shitproject

import android.app.Application
import android.content.Context
import android.widget.Toast

class Application
: Application() {
    companion object {
        var ROLE = Roles.APPLICANT
        var WIDTH = 0
        var HEIGHT = 0

        fun toast(
            msg: String,
            context: Context
        ) {
            Toast.makeText(
                context,
                msg,
                Toast.LENGTH_SHORT
            ).show()
        }
    }


    override fun onCreate() {
        super.onCreate()

        val metrics = resources
            .displayMetrics

        WIDTH = metrics.widthPixels
        HEIGHT = metrics.heightPixels
    }

}