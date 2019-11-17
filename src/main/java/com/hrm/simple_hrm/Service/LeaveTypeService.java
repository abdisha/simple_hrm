package com.hrm.simple_hrm.Service;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.LeaveTypeRepository;
import com.hrm.simple_hrm.model.LeaveType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * LeaveTypeService
 */
@Service
public class LeaveTypeService {

    @Autowired
    private LeaveTypeRepository leaveTypeRepository;

    // get all
    public List<LeaveType> getAll() {
        return leaveTypeRepository.findAll();
    }

    // save
    public LeaveType save(LeaveType leaveType) {
        leaveTypeRepository.save(leaveType);
        return leaveType;
    }

    // delete by id
    public void delete(String id) {
        leaveTypeRepository.deleteById(id);
    }

    // delete all
    public void deleteAll() {
        leaveTypeRepository.deleteAll();
    }

    // update
    public LeaveType update(String id, LeaveType leaveType) {
        leaveType.setId(id);
        leaveTypeRepository.save(leaveType);
        return leaveType;
    }

    // find by id
    public Optional<LeaveType> findById(String id) {
        return leaveTypeRepository.findById(id);
    }

}