package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User register(User user) {
        if(userMapper.selectUserByEmail(user.getEmail()) == null){
            userMapper.register(user);
            System.out.println(userMapper.selectUserById(user.getUserId()));
            return userMapper.selectUserById(user.getUserId());
        }else{
            return null;
        }
    }

    @Override
    public User login(String email, String password) {
        User current = userMapper.selectUserByEmail(email);
        if (current.getPassWord().equals(password)){
            return current;
        }
        return null;
    }
}
