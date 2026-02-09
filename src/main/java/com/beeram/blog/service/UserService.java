package com.beeram.blog.service;

import com.beeram.blog.dto.UserReq;
import com.beeram.blog.model.UserEntity;
import com.beeram.blog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity createUser(UserReq userReq){
        return UserEntity.builder()
                .username(userReq.getName())
                .email(userReq.getEmail())
                .bio(userReq.getBio())
                .image(userReq.getImage())
                .build();
    }
}
