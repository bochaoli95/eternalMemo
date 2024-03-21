package com.em;
import com.em.entity.User;
import com.em.mapper.UserMapper;
import com.em.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
        System.out.println(redisUtil.get("2"));
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}