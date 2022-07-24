package com.itcast.shopmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:33:03
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

