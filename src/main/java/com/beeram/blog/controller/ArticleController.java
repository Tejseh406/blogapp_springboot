package com.beeram.blog.controller;

import com.beeram.blog.dto.ArticleReq;
import com.beeram.blog.model.Article;
import com.beeram.blog.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Article addArticle(@RequestBody ArticleReq req){
        return articleService.createArticle( req);
    }
}
