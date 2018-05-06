package com.xiaobin.example.service;

import com.xiaobin.example.pojo.User;

/**
 * @Author: xiaobin3
 * @Description:
 * @Date: Created in 22:14 2018/5/6
 * @Modified by:
 */
public interface UserService {

    public User selectByPrimaryKey(Long id);
}
