package com.itcast.shopmall.order.dao;

import com.itcast.shopmall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:33:02
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
