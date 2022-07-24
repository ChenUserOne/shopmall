package com.itcast.shopmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:25:00
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

