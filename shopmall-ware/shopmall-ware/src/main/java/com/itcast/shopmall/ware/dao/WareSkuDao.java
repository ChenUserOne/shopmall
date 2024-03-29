package com.itcast.shopmall.ware.dao;

import com.itcast.shopmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:43:31
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
