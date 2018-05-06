package com.xiaobin.example.junit;

import com.xiaobin.example.mapper.UserMapper;
import com.xiaobin.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xiaobin3
 * @Description:
 * @Date: Created in 23:36 2018/5/6
 * @Modified by:
 */
public class JunitTest {
    @Test
    public void testMapper() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.properties");
        UserMapper mapper = ac.getBean(UserMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("userMapper");
        User user = mapper.selectByPrimaryKey(1L);
        System.out.println(user);
    }
}
