package com.winnie.plugindemo.controller;

import com.winnie.plugindemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : winnie [wangliu023@qq.com]
 * @date : 2020/5/8
 * @desc
 */
@RestController
@RequestMapping("/user1")
public class UserController1 {

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return null;
    }
}
