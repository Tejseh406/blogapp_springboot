package com.beeram.blog.controller;

import com.beeram.blog.dto.LoginUserReq;
import com.beeram.blog.model.UserEntity;
import com.beeram.blog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    void loginUser(@RequestBody LoginUserReq loginUserReq){
        userService.login(loginUserReq);
    }
}
