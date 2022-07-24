package com.itcast.shopmall.coupon.dao;

import com.itcast.shopmall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 21:51:09
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
