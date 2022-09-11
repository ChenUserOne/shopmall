package com.itcast.shopmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.itcast.shopmall.member.feign")
public class ShopmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallMemberApplication.class, args);
    }

}
