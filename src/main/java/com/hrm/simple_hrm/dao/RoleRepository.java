package com.hrm.simple_hrm.dao;


import com.hrm.simple_hrm.model.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * RoleRepository
 */
public interface RoleRepository extends MongoRepository<Role,String> {

    public Role  findByroleName(String roleName);

}