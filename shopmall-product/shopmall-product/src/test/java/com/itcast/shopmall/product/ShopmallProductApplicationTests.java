package com.itcast.shopmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itcast.shopmall.product.entity.BrandEntity;
import com.itcast.shopmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ShopmallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        /*brandEntity.setDescript("");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功..");*/
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 9l));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
