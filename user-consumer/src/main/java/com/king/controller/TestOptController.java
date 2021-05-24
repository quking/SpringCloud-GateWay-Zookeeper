package com.king.controller;

import com.king.service.CommonOpt;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOptController {

    @Reference(loadbalance = "roundrobin")
    private CommonOpt commonOpt;

    @RequestMapping("/get")
    public String insert(){
        return commonOpt.getPort();
    }
}
