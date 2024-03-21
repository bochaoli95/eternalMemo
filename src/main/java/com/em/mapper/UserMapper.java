package com.em.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.em.entity.User;
import org.springframework.stereotype.Repository;

@Repository //代表这是持久层
public interface UserMapper extends BaseMapper<User> {

    //到这一步已经把简单的CRUD的编写完成了，不在是像之前mybatis一样编写接口和XXXMapper.xml，简化开发！
}
