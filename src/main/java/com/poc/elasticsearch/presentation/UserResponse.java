package com.poc.elasticsearch.presentation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private String id;
    private String name;
    private String phoneNumber;
}
