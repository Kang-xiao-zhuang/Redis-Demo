package com.zhuang.dianping.utils;

/**
 * description: ILock
 * date: 2023/4/20 21:42
 * author: Zhuang
 * version: 1.0
 */
public interface ILock {

    /**
     * 尝试获取锁
     *
     * @param timeoutSec 锁持有的超时时间，过期后自动释放
     * @return true代表获取锁成功，false代表失败
     */
    boolean tryLock(long timeoutSec);

    /**
     * 释放锁
     */
    void unlock();
}
