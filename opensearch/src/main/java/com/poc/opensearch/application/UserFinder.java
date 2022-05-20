package com.poc.opensearch.application;

import com.poc.opensearch.domain.User;
import com.poc.opensearch.domain.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserFinder {

    private final UserRepository userRepository;

    public UserFinder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(String id) {
        return userRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
    }

    public User findByName(String name) {
        return userRepository.findByNameContaining(name)
                .orElseThrow(IllegalArgumentException::new);
    }

    public User findByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumberContaining(phoneNumber)
                .orElseThrow(IllegalArgumentException::new);
    }
}
