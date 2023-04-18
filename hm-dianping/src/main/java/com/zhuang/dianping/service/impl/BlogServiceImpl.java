package com.zhuang.dianping.service.impl;

import com.zhuang.dianping.entity.Blog;
import com.zhuang.dianping.mapper.BlogMapper;
import com.zhuang.dianping.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
