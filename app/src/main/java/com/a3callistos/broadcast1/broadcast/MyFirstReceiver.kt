package com.a3callistos.broadcast1.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.a3callistos.broadcast1.activity.MainActivity
import com.a3callistos.broadcast1.app.ToastMessage

/**
 * Created by Bibesh on 8/7/17.
 */
class MyFirstReceiver : BroadcastReceiver() {

    val TAG: String = MyFirstReceiver::class.java.simpleName

    override fun onReceive(ctx: Context, intent: Intent?) {
        println(TAG)
        ToastMessage.makeToast(ctx, TAG)
    }

}