package com.itcast.shopmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShopmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallCouponApplication.class, args);
    }

}
