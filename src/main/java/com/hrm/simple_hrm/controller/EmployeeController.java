package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.EmployeeService;
import com.hrm.simple_hrm.model.Employee;
import com.hrm.simple_hrm.model.EmployeeLimitedInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




/**
 * EmployeeController
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee")
@Api(value = "Employee" , description = "Maintain company employee data")
public class EmployeeController {

    @Autowired
    private EmployeeService _empService;

    @ApiOperation("/")
      @PostMapping(value="/")
    public String create(@RequestBody Employee employee) {
        _empService.create(employee);
        return employee.toString();
    }  
    @GetMapping(value = "/employeeLimitedInfo")
    public List<EmployeeLimitedInfo> getAllEmployeeLimitedInfo() {
        return _empService.getAllEmployeeLimitedInfo();
    }
    @GetMapping(value="/")
    public List<Employee> getAll() {
        return _empService.getAll();
    }
    
   @DeleteMapping("/delete/{id}")
   public void delete(@PathVariable String id) {
       _empService.delete(id);
       
   }
   @DeleteMapping("/delete/all")
   public void deleteAll() {
       _empService.deleteAll();
       
   }
@GetMapping(value="/find/{id}")
public Optional<Employee> findById(@PathVariable String id) {
    return _empService.findById(id);
}

   @PutMapping(value="update/{id}")
   public Optional<Employee> update(@PathVariable String id, @RequestBody Employee employee) {
    

       return _empService.update(id, employee);
   }
}