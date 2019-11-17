package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.LeaveTypeService;
import com.hrm.simple_hrm.model.LeaveType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




/**
 * LeaveTypeController
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/leaveType")
@Api(value = "LeaveType", description = "manage leave types")
public class LeaveTypeController {

    @Autowired
    private LeaveTypeService lTypeService;

    @GetMapping(value="/")
    public List<LeaveType> getAll() {
        return  lTypeService.getAll();
    }
    @GetMapping(value="/find/{id")
    public Optional<LeaveType> findById(@PathVariable   String id) {
        return lTypeService.findById(id);
    }
    @PostMapping(value="/")
    public LeaveType save(@RequestBody LeaveType leaveType) {
        
        return lTypeService.save(leaveType);
    }
    @PutMapping(value="/update/{id}")
    public LeaveType update(@PathVariable String id, @RequestBody LeaveType leaveType) {
    
        
        return lTypeService.update(id, leaveType);
    }
    
    @DeleteMapping(value="/delete/{id}")
    public void delete(@PathVariable String id) {
        lTypeService.delete(id);
    }
    @DeleteMapping(value = "/")
    public void deleteAll() {
        lTypeService.deleteAll();
    }
}