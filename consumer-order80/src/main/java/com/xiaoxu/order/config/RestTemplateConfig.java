package com.xiaoxu.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 客户端 调用远程接口
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced  //客户端集群负载均衡注解
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
