package com.zhuang.dianping.service.impl;

import com.zhuang.dianping.entity.UserInfo;
import com.zhuang.dianping.mapper.UserInfoMapper;
import com.zhuang.dianping.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
