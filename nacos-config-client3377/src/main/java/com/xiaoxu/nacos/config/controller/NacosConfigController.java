package com.xiaoxu.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope    //配置动态刷新
public class NacosConfigController {

    @Value("${config.info}")
    private String configInfo;


    @RequestMapping("/config/info")
    public String getConfigInfo(){
        return  configInfo;
    }
}
