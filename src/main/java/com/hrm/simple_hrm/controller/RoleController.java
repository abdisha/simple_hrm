package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.RoleService;
import com.hrm.simple_hrm.model.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;




/**
 * RoleController
 */
@RestController
@RequestMapping("/role")
@Api(value = "/role", description = "manage role")
@CrossOrigin(origins="*")

public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping(value="/")
    public String saveRole(@RequestBody Role role) {
        
        return roleService.saveRole(role);
    }

    @GetMapping(value="/getAll")
    public List<Role> getAll() {
        return roleService.getAll();
    }
    @GetMapping(value = "/{id1}")
    public Optional<Role> getRoleById(@PathVariable String id) {
        return roleService.getById(id);
    }

    @PutMapping(value="/{id}")
    public String updateRole(@PathVariable String id, @RequestBody Role role) {
        return roleService.updateRole(id, role);
    }

    @DeleteMapping(value = "{id}")
    public void Delete(@PathVariable String id) {
        roleService.delete(id);
    }
}