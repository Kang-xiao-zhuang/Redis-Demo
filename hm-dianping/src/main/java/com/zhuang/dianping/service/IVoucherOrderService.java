package com.zhuang.dianping.service;

import com.zhuang.dianping.dto.Result;
import com.zhuang.dianping.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);

   void createVoucherOrder(VoucherOrder voucherOrder);

//   Result createVoucherOrder(Long voucherId);
}
