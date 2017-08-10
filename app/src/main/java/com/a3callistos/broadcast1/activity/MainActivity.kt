package com.a3callistos.broadcast1.activity

import android.content.IntentFilter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.a3callistos.broadcast1.R
import com.a3callistos.broadcast1.broadcast.MyFirstReceiver

/**
 * Created by Bibesh on 8/7/17.
 */
class MainActivity : AppCompatActivity() {
    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    var myFirstReceiver: MyFirstReceiver? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myFirstReceiver = MyFirstReceiver()
    }

    override fun onResume() {
        super.onResume()
        var intentFilter: IntentFilter = IntentFilter()
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE")
        registerReceiver(myFirstReceiver, intentFilter)
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(myFirstReceiver)
    }
}