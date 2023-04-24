package com.zhuang.dianping.service;

import com.zhuang.dianping.dto.Result;
import com.zhuang.dianping.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
