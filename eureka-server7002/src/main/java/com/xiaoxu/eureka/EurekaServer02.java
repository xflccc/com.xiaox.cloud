package com.xiaoxu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer   //服务注册中心
public class EurekaServer02 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02.class);
    }
}
