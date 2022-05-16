package com.poc.elasticsearch.application;

import com.poc.elasticsearch.domain.User;
import com.poc.elasticsearch.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCreator {

    private UserRepository userRepository;

    public void create(User user) {
        userRepository.save(user);
    };
}
