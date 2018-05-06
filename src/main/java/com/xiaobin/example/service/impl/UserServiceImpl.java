package com.xiaobin.example.service.impl;

import com.xiaobin.example.mapper.UserMapper;
import com.xiaobin.example.pojo.User;
import com.xiaobin.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xiaobin3
 * @Description:
 * @Date: Created in 22:17 2018/5/6
 * @Modified by:
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectByPrimaryKey(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user);
        return user;
    }
}
