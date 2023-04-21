package com.zhuang.dianping.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: RedissonConfig
 * date: 2023/4/21 13:53
 * author: Zhuang
 * version: 1.0
 */
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        // 配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.18.128:6379")
                .setPassword(null);
        // 创建RedissonClient对象
        return Redisson.create(config);
    }
}
