package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.Position;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * PositionRepository
 */
public interface PositionRepository extends MongoRepository<Position,String> {

    

}