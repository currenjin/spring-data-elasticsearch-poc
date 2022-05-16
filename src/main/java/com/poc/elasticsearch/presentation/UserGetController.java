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
    public User getUserById(@PathVariable String userId) {
        return userFinder.findById(userId);
    }

    @GetMapping(params = "name")
    public User getUserByName(@RequestParam(value = "name") String name) {
        return userFinder.findByName(name);
    }

    @GetMapping(params = "phoneNumber")
    public User getUserByPhoneNumber(@RequestParam(value = "phoneNumber") String phoneNumber) {
        return userFinder.findByPhoneNumber(phoneNumber);
    }
}
