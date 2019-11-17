package com.hrm.simple_hrm.Service;

import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.EmployeeLimitedInfoRepository;
import com.hrm.simple_hrm.dao.EmployeeRepository;
import com.hrm.simple_hrm.model.Employee;
import com.hrm.simple_hrm.model.EmployeeLimitedInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository _employeeRepository;

    @Autowired
    private EmployeeLimitedInfoRepository _employeLmInfoRepository;

    public String create(Employee employee){
       _employeeRepository.insert(employee);
       return employee.toString();
    }
    //get all limted info of employees

    public List<EmployeeLimitedInfo> getAllEmployeeLimitedInfo() {
        return _employeLmInfoRepository.findAll();
    }
    //get all employees
    public List<Employee> getAll(){
        return _employeeRepository.findAll();
    }
    //delete employees
    public void delete(String id) {
         _employeeRepository.deleteById(id);
    }
    public void deleteAll(){
        _employeeRepository.deleteAll();
    }
    //update
    public Optional<Employee> update(String id, Employee employee) 
    {
        employee.setId(id);
        _employeeRepository.save(employee);
        return _employeeRepository.findById(id);
    }
    //find
    public Optional<Employee> findById(String id) {
        return _employeeRepository.findById(id);
    }

}