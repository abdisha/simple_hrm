package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.DepartementService;
import com.hrm.simple_hrm.model.Departement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;





/**
 * DepartementController
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/departement")
@Api(value = "Departement",description = "Operation to mantains departemants")
public class DepartementController {

    @Autowired
    private DepartementService _deptService;

    @ApiOperation("/")
    @PostMapping("/")
    public String save(@RequestBody Departement departement) {
        _deptService.create(departement);
       
        return departement.toString();
    }
    
    @GetMapping("/")
    public List<Departement> getAll() {
        return _deptService.getAll();
    }
    @GetMapping("/find/{id}")
    public Optional<Departement> findById(@PathVariable(name = "id") String id) {
        return _deptService.findById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name="id") String id) {
         _deptService.deleteById(id);
    }

    @PutMapping(value="/update/{id}")
    public Optional<Departement> putMethodName(@PathVariable String id, @RequestBody Departement departement) {
        
        return  _deptService.update(id, departement);
         
    }
    
}