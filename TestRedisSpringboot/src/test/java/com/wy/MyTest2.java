package com.wy;


import com.wy.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class MyTest2 {


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    void testSaveUser() {
        redisTemplate.opsForValue().set("user", new User("李四", 12));
        User user = (User) redisTemplate.opsForValue().get("user");
        System.out.println(user);
    }


    @Test
    void testString() {
        redisTemplate.opsForValue().set("name", "zhangsan");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }


}
