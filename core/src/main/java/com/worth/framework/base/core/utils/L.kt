package com.worth.framework.base.core.utils

import android.util.Log
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

object L {
    private const val TAG = "L"
    private var isDebug: Boolean = true
    fun setDebugConfig(debugConfig: Boolean = true) {
        isDebug = debugConfig
    }
    init {
        Logger.addLogAdapter(AndroidLogAdapter())
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

