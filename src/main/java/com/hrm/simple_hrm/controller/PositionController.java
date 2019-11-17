package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.PositionService;
import com.hrm.simple_hrm.model.Position;

import org.springframework.beans.factory.annotation.Autowired;
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
 * PositionController
 */
@RestController
@RequestMapping("/Position")
@Api(value = "/Position", description = "Maintaine position of Employee ")
public class PositionController {

    @Autowired
    private PositionService postionService;

    @ApiOperation("/")
    @PostMapping(value = "/")
    public String create(@RequestBody Position position) {

        return postionService.create(position);
    }

    @GetMapping(value = "/")
    public List<Position> getAll() {
        return postionService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        postionService.delete(id);

    }

    @DeleteMapping("/delete/all")
    public void deleteAll() {
        postionService.deleteAll();

    }

    @GetMapping(value = "/find/{id}")
    public Optional<Position> findById(@PathVariable String id) {
        return postionService.findById(id);
    }

    @PutMapping(value = "update/{id}")
    public Optional<Position> update(@PathVariable String id, @RequestBody Position position) {
        return postionService.update(id, position);
    }
    
}