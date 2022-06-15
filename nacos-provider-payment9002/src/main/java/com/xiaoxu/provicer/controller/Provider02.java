package com.xiaoxu.provicer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Provider02 {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/nacos/payment/{id}")
    public String getNcosProVider(@PathVariable("id") Integer id){
        return "naocs provider, serverPort:" + serverPort + "\t id: " + id;
    }

}
