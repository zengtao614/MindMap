package com.yyds.demo.profession.web;

import com.yyds.demo.network.entry.NetResult;
import com.yyds.demo.profession.mapper.User;
import com.yyds.demo.profession.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller

public class LoginController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestParam("loginname") String loginname,@RequestParam("password") String password){
        Map params = new HashMap();
        params.put("loginname",loginname);
        params.put("password",password);
        User user = userService.findUser(params);
        return user;
    }

    @RequestMapping("/regist")
    @ResponseBody
    public NetResult regist(User user){
        user.setUserflag(1);
        user.setUserid(UUID.randomUUID().toString());
        int insert = userService.insert(user);
        NetResult netResult = new NetResult();
        if (insert==1){
            netResult.setRescode("200");
            netResult.setResmsg("注册成功");
        }else{
            netResult.setRescode("301");
            netResult.setResmsg("注册失败");
        }
        return netResult;
    }


}
