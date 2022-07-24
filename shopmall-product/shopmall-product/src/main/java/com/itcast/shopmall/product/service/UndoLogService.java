package com.itcast.shopmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-03 20:31:46
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

