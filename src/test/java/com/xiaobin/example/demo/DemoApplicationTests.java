package com.xiaobin.example.demo;

import com.xiaobin.example.pojo.User;
import com.xiaobin.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		User user = userService.selectByPrimaryKey(1L);
		System.out.println(user.toString());
	}

}
