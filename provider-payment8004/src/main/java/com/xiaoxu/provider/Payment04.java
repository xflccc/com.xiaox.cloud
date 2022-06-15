package com.xiaoxu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //开启服务发现注解
public class Payment04 {

    public static void main(String[] args) {
        SpringApplication.run(Payment04.class);
    }
}
