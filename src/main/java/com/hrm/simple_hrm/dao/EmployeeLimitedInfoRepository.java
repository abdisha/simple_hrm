package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.EmployeeLimitedInfo;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * EmployeeLimitedInfoRepository
 */
public interface EmployeeLimitedInfoRepository extends MongoRepository<EmployeeLimitedInfo,String> {

    
}