package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.LeaveTakenService;
import com.hrm.simple_hrm.model.LeaveTaken;

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
 * LeaveTakenController
 */

@RestController
@RequestMapping("/leaveTaken")
@Api(value = "/LeaveTaken", description = "manage employees leavetaken")
@CrossOrigin(origins="*")

public class LeaveTakenController {

    @Autowired
    private LeaveTakenService lTkService;
    
    @GetMapping(value="/")
    public List<LeaveTaken> getAll() {
        return lTkService.getAll();
    }
    
    @GetMapping(value = "/find/{id}")
    public Optional<LeaveTaken> findById(@PathVariable String id){
        return lTkService.findById(id);
    }
    @PostMapping(value="/")
    public LeaveTaken save(@RequestBody LeaveTaken leaveTaken) {
        
        return lTkService.save(leaveTaken);
    }
    @PutMapping(value="update/{id}")
    public LeaveTaken update(@PathVariable String id, @RequestBody LeaveTaken leaveTaken) {
     
        return lTkService.update(id, leaveTaken);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable String id) {
        lTkService.delete(id);
    }
    @DeleteMapping(value = "/")
    public void deleteAll() {
        lTkService.deleteAll();
    }
}