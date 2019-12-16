package com.hrm.simple_hrm.controller;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.Service.CompanyService;
import com.hrm.simple_hrm.model.Company;

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
 * CompanyController
 */
@RestController()
@RequestMapping("/Company")
@Api(value = "/Company",description = "Maintain comapny information")
@CrossOrigin(origins="*")

public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @ApiOperation("/")
    @PostMapping(value = "/")
    public String create(@RequestBody Company company) {

        return companyService.create(company);
    }

    @GetMapping(value = "/")
    public List<Company> getAll() {
        return companyService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        companyService.delete(id);

    }

    @DeleteMapping("/delete/all")
    public void deleteAll() {
        companyService.deleteAll();

    }

    @GetMapping(value = "/find/{id}")
    public Optional<Company> findById(@PathVariable String id) {
        return companyService.findById(id);
    }

    @PutMapping(value = "update/{id}")
    public Optional<Company> update(@PathVariable String id, @RequestBody Company company) {
        return companyService.update(id, company);
    }
}