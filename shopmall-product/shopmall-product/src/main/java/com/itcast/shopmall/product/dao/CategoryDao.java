package com.itcast.shopmall.product.dao;

import com.itcast.shopmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-03 20:31:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
