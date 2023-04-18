package com.zhuang.redis.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * description: JedisConnectionFacotry
 * date: 2023/4/17 17:52
 * author: Zhuang
 * version: 1.0
 */
public class JedisConnectionFacotry {

    private static final JedisPool jedisPool;

    static {
        //配置连接池
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(8);
        poolConfig.setMaxIdle(8);
        poolConfig.setMinIdle(0);
        poolConfig.setMaxWaitMillis(1000);
        //创建连接池对象
        jedisPool = new JedisPool(poolConfig,
                "192.168.18.128", 6379, 1000, null);
    }

    public Jedis getJedis() {
        return jedisPool.getResource();
    }
}
