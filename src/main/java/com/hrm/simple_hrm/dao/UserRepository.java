package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.Users;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
/**
 * UsersRepository
 */
@Repository
public interface UserRepository extends MongoRepository<Users, String> {

    Users findByuserName(String userName);
    Boolean existsByUserName(String userName);
}