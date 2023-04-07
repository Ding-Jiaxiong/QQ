package com.dingjiaxiong.server

import java.net.InetAddress

/**
 * @Projectname: QQ
 * @Classname: ClientInfo
 * @Author: Ding Jiaxiong
 * @Data:2023/4/7 14:42
 */

data class ClientInfo(
    val port: Int,// 客户端端口号
    val address: InetAddress,// 客户端IP地址
    val userId: String
)// 用户Id