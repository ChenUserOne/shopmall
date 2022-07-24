package com.itcast.shopmall.order.dao;

import com.itcast.shopmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:33:03
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
