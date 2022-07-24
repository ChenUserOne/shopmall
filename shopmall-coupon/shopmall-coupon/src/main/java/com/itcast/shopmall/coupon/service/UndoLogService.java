package com.itcast.shopmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 21:51:10
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

