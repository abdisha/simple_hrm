package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.LeaveTaken;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * LeaveTakeRepository
 */
public interface LeaveTakeRepository extends MongoRepository<LeaveTaken,String>{

    
}