package com.hrm.simple_hrm.Service;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.RoleRepository;
import com.hrm.simple_hrm.model.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RoleService
 */
@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    // create role
    public String saveRole(Role role) {
        roleRepository.save(role);
        return role.toString();
    }

    //get all role
    public List<Role> getAll() {
       return  roleRepository.findAll();
    }

    //find by id

    public Optional<Role> getById(String id) {
        return roleRepository.findById(id);
    }

    public String updateRole(String id, Role role) {
        role.setId(id);
        roleRepository.save(role);
        return role.toString();
    }

    public void delete(String id) {
        roleRepository.deleteById(id);

    }
    // delete role

    //update role

    ///delete all 

}