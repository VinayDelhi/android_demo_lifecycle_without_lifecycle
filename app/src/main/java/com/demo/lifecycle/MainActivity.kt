package com.demo.lifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {

    private lateinit var timerToast: TimerToast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timerToast = TimerToast(application)
        timerToast.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        timerToast.stop()
    }
}
