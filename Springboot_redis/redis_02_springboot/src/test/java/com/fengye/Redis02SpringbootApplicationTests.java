package com.fengye;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fengye.pojo.User;
import com.fengye.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringbootApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
        /***
         * redisTemplate使用：
         * opsForValue：操作字符串，类似于String
         * opsForList：操作List
         * opsForSet
         * opsForHash
         * opsForZset
         * opsForGeo
         *opsForHyperLogLog
         */
        //获取redis的连接对象
        /*RedisConnection redisConnection = redisTemplate.getConnectionFactory().getConnection();
        redisConnection.flushAll();
        redisConnection.flushDb();*/
        redisTemplate.opsForValue().set("mykey", "这个是中文");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

    @Test
    void jsonObjExecute() throws JsonProcessingException {
        //实际开发中一般接收json对象数据来操作
        User user = new User("枫夜Alex", 26);
        //String jsonVal = new ObjectMapper().writeValueAsString(user);  //序列化操作才能写入redis
        //redisTemplate.opsForValue().set("user", jsonVal);
        //如果直接set会抛出异常 DefaultSerializer requires a Serializable payload but received an object of type [com.fengye.pojo.User]
        redisTemplate.opsForValue().set("user", user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

    @Test
    void redisUtilTest() throws JsonProcessingException {
        redisUtil.set("username", "fengye");
        System.out.println(redisUtil.get("username"));
    }
}
