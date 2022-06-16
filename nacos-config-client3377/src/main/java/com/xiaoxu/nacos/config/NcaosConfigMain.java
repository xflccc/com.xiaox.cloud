package com.xiaoxu.nacos.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //服务发现注册
public class NcaosConfigMain {

    public static void main(String[] args) {
        SpringApplication.run(NcaosConfigMain.class);
    }
}
