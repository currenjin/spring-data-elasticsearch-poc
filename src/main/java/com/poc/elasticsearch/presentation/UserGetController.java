package com.poc.elasticsearch.presentation;

import com.poc.elasticsearch.application.UserFinder;
import com.poc.elasticsearch.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserGetController {
    private final UserFinder userFinder;

    @GetMapping(value = "/{userId}")
    public UserResponse getUserById(@PathVariable String userId) {
        User user = userFinder.findById(userId);
        return convertToUserResponseBy(user);
    }

    @GetMapping(params = "name")
    public UserResponse getUserByName(@RequestParam(value = "name") String name) {
        User user = userFinder.findByName(name);
        return convertToUserResponseBy(user);
    }

    @GetMapping(params = "phoneNumber")
    public UserResponse getUserByPhoneNumber(@RequestParam(value = "phoneNumber") String phoneNumber) {
        User user = userFinder.findByPhoneNumber(phoneNumber);
        return convertToUserResponseBy(user);
    }

    private UserResponse convertToUserResponseBy(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .name(user.getName())
                .phoneNumber(user.getPhoneNumber())
                .build();
    }
}
