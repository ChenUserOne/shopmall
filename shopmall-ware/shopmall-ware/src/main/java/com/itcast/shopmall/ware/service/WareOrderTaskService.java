package com.itcast.shopmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-24 23:43:31
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

