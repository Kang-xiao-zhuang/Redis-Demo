package com.zhuang.dianping.service.impl;

import com.zhuang.dianping.entity.BlogComments;
import com.zhuang.dianping.mapper.BlogCommentsMapper;
import com.zhuang.dianping.service.IBlogCommentsService;
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
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
