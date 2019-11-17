package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeRepository
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

    
}