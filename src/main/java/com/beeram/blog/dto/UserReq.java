package com.beeram.blog.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class UserReq {

    private String name;
    private String email;
    private String bio;
    private String image;
}
