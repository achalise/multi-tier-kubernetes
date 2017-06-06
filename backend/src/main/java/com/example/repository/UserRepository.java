package com.example.repository;

import com.example.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by achalise on 2/6/17.
 */
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
