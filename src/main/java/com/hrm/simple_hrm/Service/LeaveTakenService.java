package com.hrm.simple_hrm.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.hrm.simple_hrm.dao.LeaveTakeRepository;
import com.hrm.simple_hrm.model.LeaveTaken;

import org.springframework.beans.factory.annotation.Autowired;
/**
 * LeaveTakenService
 */
@Service
public class LeaveTakenService {

    @Autowired
    private LeaveTakeRepository leaveTakeRepository;
       
       //get all
       public List<LeaveTaken> getAll(){
           return leaveTakeRepository.findAll();
       }
   
       //save
       public LeaveTaken save(LeaveTaken leaveTaken){
           leaveTakeRepository.save(leaveTaken);
           return leaveTaken;
       }
   
       //update
       public LeaveTaken update(String id,LeaveTaken leaveTaken) {
           leaveTaken.setId(id);
           leaveTakeRepository.save(leaveTaken);
           return leaveTaken;
       }
       //find by id
       public Optional<LeaveTaken> findById(String id) {
           return leaveTakeRepository.findById(id);
       } 
       //delete
       public void delete(String id) {
           leaveTakeRepository.deleteById(id);
       } 
       //delete all
       public void deleteAll() {
           leaveTakeRepository.deleteAll();
       }
}