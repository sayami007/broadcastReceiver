package com.a3callistos.broadcast1.activity

import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.a3callistos.broadcast1.R

/**
 * Created by Bibesh on 8/7/17.
 */
class MainActivity : AppCompatActivity() {

    open val TAG: String = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun methodOne(v: View) {
        var intentFilter: IntentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED)

        var intent: Intent = registerReceiver(null, intentFilter)
        var status: Int = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1)
        println(status)
    }

}