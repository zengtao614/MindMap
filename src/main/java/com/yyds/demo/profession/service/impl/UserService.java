package com.yyds.demo.profession.service.impl;

import com.yyds.demo.profession.mapper.User;
import com.yyds.demo.profession.mapper.UserMapper;
import com.yyds.demo.profession.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(Map params) {
        return userMapper.findUserBylogin(params);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
