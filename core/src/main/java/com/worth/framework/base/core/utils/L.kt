package com.worth.framework.base.core.utils

import android.util.Log


object L {
    private const val TAG = "L"
//    private val isDebug: Boolean = logEnable == 1
    private var isDebug: Boolean = (logEnable == 1)

    fun setDebugConfig(debugConfig: Boolean = true) {
    }

    @JvmOverloads
    @JvmStatic
    fun v(tag: String = TAG, msg: String? = null) {
        if (isDebug) {
            msg?.run {
                Log.v(tag, msg)
            }
        }
    }

    @JvmOverloads
    @JvmStatic
    fun d(tag: String = TAG, msg: String? = null) {
        if (isDebug) {
            msg?.run {
                Log.d(tag, msg)
            }
        }
    }

    @JvmOverloads
    @JvmStatic
    fun e(tag: String = TAG, msg: String? = null) {
        if (isDebug) {
            msg?.run {
                Log.e(tag, msg)
            }
        }
    }

    @JvmOverloads
    @JvmStatic
    fun i(tag: String = TAG, msg: String? = null) {
        if (isDebug) {
            msg?.run {
                Log.i(tag, msg)
            }
        }
    }

    @JvmOverloads
    @JvmStatic
    fun w(tag: String = TAG, msg: String? = null) {
        if (isDebug) {
            msg?.run {
                Log.w(tag, msg)
            }
        }
    }

}

