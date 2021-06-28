package com.worth.framework.base.core.utils

import android.content.pm.PackageManager

/**
 * Author:  LiuHao
 * Email:   114650501@qq.com
 * TIME:    6/28/21 --> 5:28 PM
 * Description: This is SdkConfigs
 */
/**
 * 获取Int类型的meta标签
 */
private fun getMetaDataByInt(key: String): Int = application?.packageName?.let {
    val meta = application?.packageManager?.getApplicationInfo(it, PackageManager.GET_META_DATA)
    meta?.metaData?.getInt(key) ?: 0
} ?: 0
val logEnable: Int = getMetaDataByInt("LOG_ENABLE")
