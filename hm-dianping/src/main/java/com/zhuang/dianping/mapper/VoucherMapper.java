package com.zhuang.dianping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuang.dianping.entity.Voucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 康小庄
 * @since 2023-4-18
 */
public interface VoucherMapper extends BaseMapper<Voucher> {

    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
