package com.qyh.springboot.dubbo.demo.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import service.UserService;


@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String get() {
        return "qyh";
    }
}
