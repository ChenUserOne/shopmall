package com.itcast.shopmall.order.dao;

import com.itcast.shopmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:33:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
