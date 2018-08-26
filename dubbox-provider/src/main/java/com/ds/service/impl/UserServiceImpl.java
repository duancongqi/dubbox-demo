package com.ds.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ds.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "段大神经";
    }
}
