package com.hrm.simple_hrm.Service;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.DepartementRepository;
import com.hrm.simple_hrm.model.Departement;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * DepartementService
 */
@Service
public class DepartementService {

    @Autowired
    private DepartementRepository _deptRepo;

    // Tod saving departement
    public Departement create(Departement departement) {
        return _deptRepo.insert(departement);
    }

    // Todo modifieying department
    public Optional<Departement> update(String Id, Departement departement) {
        departement.setId(Id);
        _deptRepo.save(departement);
        return _deptRepo.findById(Id);
    }

    // Tod get all Department
    public List<Departement> getAll() {
        return _deptRepo.findAll();
    }

    public Optional<Departement> findById(String Id) {
        return _deptRepo.findById(Id);
    }

    public void deleteById(String Id) {
        _deptRepo.deleteById(Id);
    }
    //delete all
    public void  deleteAll() {
        _deptRepo.deleteAll();
    }
}