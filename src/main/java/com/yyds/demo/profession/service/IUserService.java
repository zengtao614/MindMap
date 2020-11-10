package com.yyds.demo.profession.service;

import com.yyds.demo.profession.mapper.User;

import java.util.Map;

public interface IUserService {

    public User findUser(Map params);

    public int insert(User user);
}
