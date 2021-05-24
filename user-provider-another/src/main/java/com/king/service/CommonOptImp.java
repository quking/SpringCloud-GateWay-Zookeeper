package com.king.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(interfaceClass = CommonOpt.class)
public class CommonOptImp implements CommonOpt{

    @Value("${server.port}")
    private String port;
    @Override
    public String getPort() {
        return "port is "+port;
    }
}
