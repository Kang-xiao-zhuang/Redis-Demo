package com.zhuang.redis;

import com.zhuang.redis.message.AnnouncementMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class RedisDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void testString() {
        // 写入一条String数据
        redisTemplate.opsForValue().set("name", "康小庄");
        // 获取string数据
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("name = " + name);
    }

    @Test
    public void testSubscribe() {
        String achannel = "topica";
        String bchannel = "topicb";

        redisTemplate.convertAndSend(achannel, "hello world1");

        redisTemplate.convertAndSend(bchannel, new AnnouncementMessage("1", "模拟发通告"));
    }
}
