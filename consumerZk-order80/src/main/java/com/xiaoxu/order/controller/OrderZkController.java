package com.xiaoxu.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderZkController {

    /**
     * 被调用者服务
     */
    public static final String INVOCK_URL = "http://provider-paymment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String getPayment(){
        String result = restTemplate.getForObject(INVOCK_URL + "/payment/zk", String.class);
        return result;
    }

}
