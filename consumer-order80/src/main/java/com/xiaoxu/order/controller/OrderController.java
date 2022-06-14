package com.xiaoxu.order.controller;

import com.xiaoxu.api.entities.Payment;
import com.xiaoxu.api.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 消费者客户端
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {

    /**
     * 生产者地址
     */
    public static final String PAYMENT_URL = "http://localhost:8001";

    /**
     * 客户端
     */
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public CommonResult<List<Payment>> getList(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/list",CommonResult.class);
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
    }

    @GetMapping(value = "/create")
    public CommonResult<Payment>  create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create/" ,payment,CommonResult.class);
    }
}
