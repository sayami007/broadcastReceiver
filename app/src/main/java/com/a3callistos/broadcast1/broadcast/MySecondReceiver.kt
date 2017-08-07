package com.a3callistos.broadcast1.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.a3callistos.broadcast1.app.ToastMessage

/**
 * Created by Bibesh on 8/7/17.
 */
class MySecondReceiver : BroadcastReceiver() {

    val TAG:String = MySecondReceiver::class.java.simpleName

    override fun onReceive(p0: Context, p1: Intent?) {
        ToastMessage.makeToast(p0,TAG)
    }
}