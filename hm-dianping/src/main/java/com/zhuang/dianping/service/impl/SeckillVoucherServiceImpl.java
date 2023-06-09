package com.zhuang.dianping.service.impl;

import com.zhuang.dianping.entity.SeckillVoucher;
import com.zhuang.dianping.mapper.SeckillVoucherMapper;
import com.zhuang.dianping.service.ISeckillVoucherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀优惠券表，与优惠券是一对一关系 服务实现类
 * </p>
 *
 * @author 康小庄
 * @since 2022-01-04
 */
@Service
public class SeckillVoucherServiceImpl extends ServiceImpl<SeckillVoucherMapper, SeckillVoucher> implements ISeckillVoucherService {

}
