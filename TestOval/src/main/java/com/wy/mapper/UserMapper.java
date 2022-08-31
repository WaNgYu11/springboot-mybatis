package com.wy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wy.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper extends BaseMapper<User> {


    List<User> selectUserAll();


    void insertUser(User user);
}
