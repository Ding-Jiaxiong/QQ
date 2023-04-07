package com.dingjiaxiong.client

import java.net.DatagramSocket
import com.beust.klaxon.Parser

/**
 * @Projectname: QQ
 * @Classname: Client
 * @Author: Ding Jiaxiong
 * @Data:2023/4/7 14:57
 */

// 操作命令代码
const val COMMAND_LOGIN = 1 // 登录命令
const val COMMAND_LOGOUT = 2 // 下线命令
const val COMMAND_SENDMSG = 3 // 发消息命令
const val COMMAND_REFRESH = 4 // 刷新好友列表命令

// 服务器端IP
const val SERVER_IP = "127.0.0.1"

// 服务器端端口号
const val SERVER_PORT = 7788

var socket = DatagramSocket()

//JSON解析器
val parser = Parser.default()

fun main() {
    // 设置超时2秒，不再等待接收数据
    socket.soTimeout = 2000
    println("客户端运行...")
    LoginFrame().isVisible = true
}