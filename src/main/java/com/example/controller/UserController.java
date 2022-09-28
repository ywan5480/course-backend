package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public User login(@RequestParam("email") String email, @RequestParam("password") String password){
        return userService.login(email, password);
    }

    @PutMapping("register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }
}
