package com.fengye.jedis;

import redis.clients.jedis.Jedis;

public class JedisDemo {
    public static void main(String[] args) {
        //1.创建Jedis对象
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //验证密码，如果没有设置密码则无需该操作
        //jedis.auth("");
        jedis.connect();
        //2.执行命令操作
        System.out.println(jedis.ping());  //输出PONG表示成功
        //3.执行redis相关命令操作
        jedis.flushAll(); //清空所有的key操作
        //4.关闭断开连接
        jedis.disconnect();
    }
}
