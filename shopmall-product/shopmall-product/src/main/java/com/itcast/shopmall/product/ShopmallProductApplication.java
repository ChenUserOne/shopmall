package com.itcast.shopmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itcast.shopmall.product.dao")
public class ShopmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallProductApplication.class, args);
    }

}
