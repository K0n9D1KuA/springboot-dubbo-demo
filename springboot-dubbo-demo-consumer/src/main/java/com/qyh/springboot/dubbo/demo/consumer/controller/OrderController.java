package com.qyh.springboot.dubbo.demo.consumer.controller;

import com.qyh.springboot.dubbo.demo.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("order")
    public String order() {
        return orderService.getOrder("hello");
    }
}
