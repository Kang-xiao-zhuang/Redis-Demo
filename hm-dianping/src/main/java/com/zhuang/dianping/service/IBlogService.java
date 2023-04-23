package com.zhuang.dianping.service;

import com.zhuang.dianping.dto.Result;
import com.zhuang.dianping.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
public interface IBlogService extends IService<Blog> {
    Result queryBlogById(Long id);

    Result queryHotBlog(Integer current);

    Result likeBlog(Long id);

    Result queryBlogLikes(Long id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);
}
