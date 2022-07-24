package com.itcast.shopmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.common.utils.PageUtils;
import com.itcast.shopmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hmm
 * @email 1771080823@qq.com
 * @date 2022-07-03 20:31:47
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

