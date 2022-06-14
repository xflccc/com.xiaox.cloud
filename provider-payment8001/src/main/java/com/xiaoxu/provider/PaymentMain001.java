package com.xiaoxu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //服务客户端  既可以是生产者也可以是消费者
public class PaymentMain001{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain001.class);
    }
}
