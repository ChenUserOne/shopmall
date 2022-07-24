package com.itcast.shopmall.product.dao;

import com.itcast.shopmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-03 20:31:47
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
