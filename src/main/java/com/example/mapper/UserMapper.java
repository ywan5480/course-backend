package com.example.mapper;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    User selectUserByEmail(String email);
    int register(User user);
    List<User> selectAll();
    User selectUserById(Integer id);

}
