package com.beeram.blog.service;

import com.beeram.blog.dto.ArticleReq;
import com.beeram.blog.model.Article;
import com.beeram.blog.model.UserEntity;
import com.beeram.blog.repository.ArticleRepository;
import com.beeram.blog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;
    private final UserRepository userRepository;

    public Article createArticle(ArticleReq articleReq){

        UserEntity author = userRepository.findById(articleReq.getUserId()).orElseThrow(() -> new RuntimeException("User not found"));

        String slug = createSlug(articleReq.getTitle());

        Article article = Article.builder()
                .title(articleReq.getTitle())
                .content(articleReq.getContent())
                .author(author)
                .slug(slug).build();

        return articleRepository.save(article);
    }


    private String createSlug(String title){
        return title.toLowerCase()
                .replaceAll("[^a-z0-9\\s]","")
                .replaceAll("\\s+","-");
    }
}
