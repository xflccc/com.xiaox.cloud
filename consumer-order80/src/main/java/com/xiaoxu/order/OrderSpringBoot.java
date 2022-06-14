package com.xiaoxu.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //服务客户端
public class OrderSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringBoot.class);
    }
}
