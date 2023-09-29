package com.wahidabd.synrgynguli.utils

import android.os.CountDownTimer


/**
 * Created by Wahid on 9/29/2023.
 * Github github.com/wahidabd.
 */


fun setTimer(
    timer: Long,
    interval: Long,
    onTick: ((Long) -> Unit)? = null,
    onFinis: (() -> Unit)? = null
) = object : CountDownTimer(timer, interval){
    override fun onTick(time: Long) {
        onTick?.invoke(time / interval)
    }
    override fun onFinish() {
        onFinis?.invoke()
    }
}