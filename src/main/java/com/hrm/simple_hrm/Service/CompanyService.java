package com.hrm.simple_hrm.Service;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.CompanyRepositroy;
import com.hrm.simple_hrm.model.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CompanyService
 */
@Service
public class CompanyService {

    @Autowired
    private CompanyRepositroy _CompanyRepositroy;

    public List<Company> getAll() {
        return _CompanyRepositroy.findAll();
    }
    //create Company
    public String create(Company company) {
        _CompanyRepositroy.save(company);
        return company.toString();
    }
    // deleteCompany s
    public void delete(String id) {
        _CompanyRepositroy.deleteById(id);
    }

    public void deleteAll() {
        _CompanyRepositroy.deleteAll();
    }

    // update
    public Optional<Company> update(String id, Company company) {
      company.setId(id);
        _CompanyRepositroy.save(company);
        return _CompanyRepositroy.findById(id);
    }

    // find
    public Optional<Company> findById(String id) {

        return _CompanyRepositroy.findById(id);
    }

}