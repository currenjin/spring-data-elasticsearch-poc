package com.poc.elasticsearch.presentation;

import lombok.Data;

@Data
public class UserPostRequest {
    private String id;
    private String name;
    private String phoneNumber;
}
