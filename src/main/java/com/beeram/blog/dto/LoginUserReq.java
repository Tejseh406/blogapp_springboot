package com.beeram.blog.dto;

import lombok.Data;

@Data
public class LoginUserReq {

    private String email;
    private String password;
}
