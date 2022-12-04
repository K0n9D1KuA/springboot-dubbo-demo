package com.qyh.springboot.dubbo.demo.consumer.service.impl;

import com.qyh.springboot.dubbo.demo.consumer.service.OrderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;


@Service
public class OrderServiceImpl implements OrderService {
    @DubboReference
    private UserService userService;

    @Override
    public String getOrder(String prefix) {
        return prefix + userService.get();
    }
}
