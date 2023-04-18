package com.zhuang.dianping.service;

import com.zhuang.dianping.dto.Result;
import com.zhuang.dianping.entity.Voucher;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
