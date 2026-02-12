package com.beeram.blog.dto;

import lombok.Data;

@Data
public class ArticleReq {

    private String title;
    private String content;
    private Long userId;

}
