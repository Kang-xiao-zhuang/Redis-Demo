package com.zhuang.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuang.dianping.dto.LoginFormDTO;
import com.zhuang.dianping.dto.Result;
import com.zhuang.dianping.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
