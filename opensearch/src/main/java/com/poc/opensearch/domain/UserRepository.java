package com.poc.opensearch.domain;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface UserRepository extends ElasticsearchRepository<User, String> {
    Optional<User> findByNameContaining(String name);
    Optional<User> findByPhoneNumberContaining(String phoneNumber);
}
