package com.a3callistos.broadcast1.activity

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.a3callistos.broadcast1.broadcast.MyFirstReceiver
import com.a3callistos.broadcast1.R
import com.a3callistos.broadcast1.app.ToastMessage

/**
 * Created by Bibesh on 8/7/17.
 */
class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendBroadcastMessage(v: View) {
        var intent: Intent = Intent("my.custom.action.name")
        sendBroadcast(intent)
    }

    fun innerReceiver(v: View) {
//        val intent: Intent = Intent(this, MyFirstBroadcast::class.java)
//        sendBroadcast(intent)
    }

    class MyFirstBroadcast : BroadcastReceiver() {
        override fun onReceive(p0: Context?, p1: Intent?) {
            ToastMessage.makeToast(p0, TAG)
        }
    }

}