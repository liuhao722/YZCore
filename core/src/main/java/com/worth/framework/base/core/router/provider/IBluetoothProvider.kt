package com.worth.framework.base.core.router.provider

import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.worth.framework.base.core.bean.BluetoothBean
import com.worth.framework.base.core.router.BluetoothConnectionProvider

/**
 * Author:  LiuHao
 * Email:   114650501@qq.com
 * TIME:    6/14/21 --> 5:21 AM
 * Description: This is IBluetoothProvider
 * 1、连接
 * 2、断连
 * 3、蓝牙扫描结果列表
 * 4、单击-会员卡：唤醒语音助手
 * 5、双击-会员卡：结账
 * 6、长按-会员卡：绑卡信号，成功绑定则推送至卡广播，闪烁蓝牙一下
 * 7、提供基站sdk连接wifi功能
 * 8、提供设置蓝牙 iemi（mac地址）方法
 */
@Route(
    path = BluetoothConnectionProvider.PATH_BLUETOOTH_PROVIDER,
    name = "提供链接，断开链接，返回设备扫描信息，单击事件-唤醒语音助手，双击事件-结账，长按事件 "
)
interface IBluetoothProvider : IProvider {
    /**
     * 链接
     */
    fun connect()

    /**
     * 断开
     */
    fun disconnect()

    /**
     * 获取蓝牙扫描的列表数据
     */
    fun listenerBluetoothSearch(): List<BluetoothBean>

    /**
     * 单击会员卡--唤醒语音助手
     */
    fun clickVipCard()

    /**
     * 双击会员卡--结账
     */
    fun doubleClickVipCard()

    /**
     * 长按会员卡--绑卡信号，成功绑定则推送至卡广播，闪烁蓝牙一下
     */
    fun pressVipCard()

    /**
     * 发送指令到vipCard
     */
    fun appSendMsgToVipCard(cmd: String?)


    /**
     * 连接wifi
     */
    fun wifiConn()

    /**
     * 设置macID
     */
    fun setMacId(macId:String)

}