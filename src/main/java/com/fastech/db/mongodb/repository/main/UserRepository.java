package com.fastech.db.mongodb.repository.main;

import com.fastech.db.mongodb.entity.User;
import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
//    User findByUsername(String username);
    void insert(BasicDBObject basicDBObject);
}