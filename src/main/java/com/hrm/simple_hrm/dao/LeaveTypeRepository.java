package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.LeaveType;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * LeaveTypeRepository
 */
public interface LeaveTypeRepository extends MongoRepository<LeaveType,String> {

    
}