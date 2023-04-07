package com.dingjiaxiong.server

import org.jetbrains.exposed.sql.Table

/**
 * @Projectname: QQ
 * @Classname: DBSchema
 * @Author: Ding Jiaxiong
 * @Data:2023/4/7 14:37
 */

const val URL = "jdbc:mysql://localhost:3306/qq?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8"
const val DRIVER_CLASS = "com.mysql.cj.jdbc.Driver"
const val DB_USER = "root"
const val DB_PASSWORD = "123456"

/* 用户表 */
object Users : Table() {
    //声明表中字段
//    override val primaryKey = PrimaryKey(productid, name = "PK_Produc_ID")

    val user_id = varchar("user_id", length = 80)           /* 用户Id  */
    override val primaryKey = PrimaryKey(user_id, name = "PK_UserID")

    val user_pwd = varchar("user_pwd", length = 25)         /* 用户密码 */
    val user_name = varchar("user_name", length = 80)       /* 用户名 */
    val user_icon = varchar("user_icon", length = 100)      /* 用户头像 */
}

/* 用户好友表Id1和Id2互为好友 */
object Friends : Table() {
    val user_id1 = varchar("user_id1", length = 10) /* 用户Id1  */
    val user_id2 = varchar("user_id2", length = 10) /* 用户Id2  */
    override val primaryKey = PrimaryKey(user_id1, user_id2, name = "PK_UserId1Id2")
}