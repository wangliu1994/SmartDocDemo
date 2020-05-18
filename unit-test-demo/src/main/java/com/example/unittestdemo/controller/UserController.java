package com.example.unittestdemo.controller;

import com.example.unittestdemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/5/8
 * @desc
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 获取用户列表
     * @param user 用户信息
     * @return 用户列表
     */
    @PostMapping("/list")
    public List<User> addUser(@RequestBody User user){
        return null;
    }
}
