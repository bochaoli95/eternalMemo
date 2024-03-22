package com.em.mybatis;
import com.em.entity.Memory;
import com.em.entity.User;
import com.em.mapper.MemoryMapper;
import com.em.mapper.UserMapper;
import com.em.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Entity {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MemoryMapper memoryMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        List<Memory> memories = memoryMapper.selectList(null);
        users.forEach(System.out::println);
        memories.forEach(System.out::println);
    }


}