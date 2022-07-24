package com.itcast.shopmall.coupon.dao;

import com.itcast.shopmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 21:51:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
