package com.hrm.simple_hrm.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hrm.simple_hrm.dao.EmployeeRepository;
import com.hrm.simple_hrm.model.Employee;
import com.hrm.simple_hrm.model.EmployeeLimitedInfo;

import org.bson.BsonBinarySubType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * EmployeeService
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository _employeeRepository;

    private MongoTemplate mongoTemplate;

    public EmployeeService(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public String create(Employee employee) {
        
    

        _employeeRepository.insert(employee);
        return employee.toString();
    }
    // get all limted info of employees

    public List<EmployeeLimitedInfo> getAllEmployeeLimitedInfo() {
        List<EmployeeLimitedInfo> eLimitedInfos = new ArrayList<EmployeeLimitedInfo>();
        _employeeRepository.findAll().forEach((x) -> {
            eLimitedInfos.add(new EmployeeLimitedInfo(x.getId(),x.getProfileImage(), x.getEmployeeId(),
                    x.getFullName(), x.getSex(), x.getAge(), x.getStatus()));
        });
        return eLimitedInfos;
    }

    public byte[]  getImage(String employeeId) {
        Query query =new Query(Criteria.where("employeeId").is(employeeId));
        query.fields().include("profileImage");
       Employee employee= mongoTemplate.findOne(query, Employee.class);
        return employee.getProfileImage().getData();
    }
    // get all employees
    public List<Employee> getAll() {
        
        return _employeeRepository.findAll();
    }

    // delete employees
    public void delete(String id) {
        _employeeRepository.deleteById(id);
    }

    public void deleteAll() {
        _employeeRepository.deleteAll();
    }

    // update
    public Employee update(String id, Employee employee) {
        employee.setId(id);
        _employeeRepository.save(employee);
        return _employeeRepository.findByemployeeId(id);
    }

    // find
    public Employee findById(String id) {
        return _employeeRepository.findByemployeeId(id);
    }

    public boolean uploadPofile(String id, MultipartFile file) {

            Query query = new Query();
            query.addCriteria(Criteria.where("employeeId").is(id));

            Employee employee = mongoTemplate.findOne(query, Employee.class);
            try {
                employee.setProfileImage(new org.bson.types.Binary(BsonBinarySubType.BINARY, file.getBytes()));
                mongoTemplate.save(employee);
                return true;
            } catch (IOException e) {
               
                e.printStackTrace();
               
            }
            
         return false;
	}

}