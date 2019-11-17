package com.hrm.simple_hrm.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hrm.simple_hrm.model.*;

/**
 * DepartementRepository
 */
@Repository
public interface DepartementRepository extends MongoRepository<Departement, String> {

}