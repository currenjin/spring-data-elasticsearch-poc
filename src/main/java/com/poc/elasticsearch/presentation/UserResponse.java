package com.poc.elasticsearch.presentation;

public class UserResponse {
    private String id;
    private String name;
    private String phoneNumber;

    public UserResponse(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
