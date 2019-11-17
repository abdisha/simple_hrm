package com.hrm.simple_hrm.dao;

import com.hrm.simple_hrm.model.Company;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * CompanyRepositroy
 */
public interface CompanyRepositroy extends MongoRepository<Company,String> {

    
}