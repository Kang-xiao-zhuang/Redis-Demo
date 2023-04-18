package com.zhuang.dianping.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.zhuang.dianping.dto.UserDTO;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * description: LoginInterceptor
 * date: 2023/4/18 8:24
 * author: Zhuang
 * version: 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {

    //private StringRedisTemplate stringRedisTemplate;

//    public LoginInterceptor() {
//    }
//
//    public LoginInterceptor(StringRedisTemplate stringRedisTemplate) {
//        this.stringRedisTemplate = stringRedisTemplate;
//    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       /* // 获取session
        HttpSession session = request.getSession();
        // 获取session中的用户
        Object user = session.getAttribute("user");
        // 判断用户是否存在
        if (user == null) {
            // 不存在，拦截，返回401状态码
            response.setStatus(401);
            return false;
        }
        // 存在，保存用户信息到ThreadLocal
        UserHolder.saveUser((UserDTO) user);
        // 放行
        return true;*/


        /*String token = request.getHeader("authorization");
        String key = RedisConstants.LOGIN_USER_KEY + token;
        if (StrUtil.isBlank(token)) {
            // 不存在，拦截，返回401状态码
            response.setStatus(401);
            return false;
        }
        // 基于Token获取redis的用户
        Map<Object, Object> userMap = stringRedisTemplate.opsForHash().entries(key);
        if (userMap.isEmpty()) {
            // 不存在，拦截，返回401状态码
            response.setStatus(401);
            return false;
        }
        // 将查询到的Hash数据转为UserDTO
        UserDTO userDTO = BeanUtil.fillBeanWithMap(userMap, new UserDTO(), false);
        // 存在，保存用户信息到ThreadLocal
        UserHolder.saveUser(userDTO);
        // 刷新token有效期
        stringRedisTemplate.expire(key, RedisConstants.LOGIN_USER_TTL, TimeUnit.MINUTES);
        return true;*/

        // 1.判断是否需要拦截（ThreadLocal中是否有用户）
        if (UserHolder.getUser() == null) {
            // 没有，需要拦截，设置状态码
            response.setStatus(401);
            // 拦截
            return false;
        }
        // 有用户，则放行
        return true;
    }

}
