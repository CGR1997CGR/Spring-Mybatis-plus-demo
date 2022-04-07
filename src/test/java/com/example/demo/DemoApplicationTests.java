package com.example.demo;

import com.example.demo.Entity.user;
import com.example.demo.Mapper.userMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    userMapper usermapper;

    @Test
    void contextLoads() {
        List<user> users = usermapper.selectList(null);
        users.forEach((System.out::println));

    }

}
