package com.itcast.shopmall.member.dao;

import com.itcast.shopmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:24:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
