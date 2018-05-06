package com.xiaobin.example.web;

import com.xiaobin.example.pojo.User;
import com.xiaobin.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: xiaobin3
 * @Description:
 * @Date: Created in 22:09 2018/5/6
 * @Modified by:
 */
@Controller
@RequestMapping(value = "/mylog")
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public String getUser(){
        User user = userService.selectByPrimaryKey(1L);
        return user.toString();
    }
}
