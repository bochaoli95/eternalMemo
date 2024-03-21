package com.em.controller;

import com.em.entity.User;
import com.em.util.RedisUtil;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource(name = "myRedisTemplate")
    private RedisTemplate<String,Object> redisTemplate;
    @ResponseBody
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public void upload(Integer uploadType, HttpServletRequest request) throws Exception {
        redisTemplate.opsForValue().set("4",new User());
    }
}
