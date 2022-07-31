package com.itcast.shopmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShopmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmallMemberApplication.class, args);
    }

}
