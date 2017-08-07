package com.a3callistos.broadcast1.app

import android.content.Context
import android.widget.Toast

/**
 * Created by Bibesh on 8/7/17.
 */

class ToastMessage {

    companion object {
        fun makeToast(ctx: Context?, msg: String) {
            Toast.makeText(ctx, "Message from " + msg, Toast.LENGTH_LONG).show()
        }

    }
}