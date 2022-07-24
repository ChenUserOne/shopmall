package com.itcast.shopmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:33:02
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

