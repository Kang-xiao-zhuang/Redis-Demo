package com.zhuang.dianping.service;

import com.zhuang.dianping.dto.Result;
import com.zhuang.dianping.entity.Follow;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
public interface IFollowService extends IService<Follow> {

    Result follow(Long followUserId, Boolean isFollow);

    Result isFollow(Long followUserId);

    Result followCommons(Long id);
}
