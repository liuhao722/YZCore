package com.worth.framework.base.core.helper

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.worth.framework.base.core.storage.MeKVUtil
import com.worth.framework.base.core.utils.L

/**
 * Author:  LiuHao
 * Email:   114650501@qq.com
 * 核心库的初始化操作
 */
class SdkCoreHelper private constructor() {

    /**
     * 初始化sdk--放在application里面进行初始化
     * @param isDebugConfig 是否是debug模式，开关
     */
    @JvmOverloads
    fun initCore(application: Application, isDebugConfig: Boolean = true) {
        L.setDebugConfig(isDebugConfig)
        application?.let {
            ARouter.init(it)
            MeKVUtil.initMMKV(it)
        }
    }

    /**
     * 对象单例
     */
    companion object {
        val instance =
            SingletonHolder.holder
    }

    private object SingletonHolder {
        val holder = SdkCoreHelper()
    }
}
