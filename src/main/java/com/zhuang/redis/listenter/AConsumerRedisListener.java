package com.zhuang.redis.listenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Redis中发布的消息的侦听器A
 */
@Component
public class AConsumerRedisListener implements MessageListener {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * @param message 传递过来的信息数据
     * @param pattern 频道
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {
        doBusiness(message);
    }

    /**
     * 打印 message body 内容
     * <p>
     * deserialize 从给定的二进制数据反序列化一个对象。
     *
     * @param message Message
     */
    public void doBusiness(Message message) {
        Object value = redisTemplate.getValueSerializer().deserialize(message.getBody());
        System.out.println("A==>consumer message: " + value.toString());
    }

}
