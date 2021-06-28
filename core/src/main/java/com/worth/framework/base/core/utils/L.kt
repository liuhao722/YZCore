package com.worth.framework.base.core.utils

import android.content.pm.PackageManager
import android.util.Log
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


/**
 * 获取Int类型的meta标签
 */
private fun getMetaDataByInt(key: String): Int = application?.packageName?.let {
    val meta = application?.packageManager?.getApplicationInfo(it, PackageManager.GET_META_DATA)
    meta?.metaData?.getInt(key) ?: 0
} ?: 0
val logEnable: Int = getMetaDataByInt("LOG_ENABLE")

object L {
    private const val TAG = "L"
//    private val isDebug: Boolean = logEnable == 1
    private val isDebug: Boolean = true

    fun setDebugConfig(debugConfig: Boolean = true) {
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

