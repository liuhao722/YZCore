package com.worth.framework.base.core.bean

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Author:  LiuHao
 * Email:   114650501@qq.com
 * TIME:    6/14/21 --> 12:42 PM
 * Description: This is BluetoothBean
 */
@Parcelize
data class BluetoothBean(
    var bluetoothId: Int,
    var bluetoothName: String,
    var bluetoothMacId: String,
    var bluetoothIP: String
) : Parcelable