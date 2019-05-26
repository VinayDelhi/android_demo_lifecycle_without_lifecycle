package com.demo.lifecycle

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import java.util.*

class TimerToast(application: Application) {

    //Note: onTick & onFinished will
    // be called in different thread than the main thread.

    private val timer = object: CountDownTimer(60000, 3000){
        override fun onFinish() {
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            Toast.makeText(application, "timer finished", Toast.LENGTH_LONG).show()

        }

        override fun onTick(millisUntilFinished: Long) {
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            Toast.makeText(application, "$millisUntilFinished", Toast.LENGTH_LONG).show()
        }

    }

    fun start(){
        timer.start()
    }

    fun stop(){
        timer.cancel();
    }
}