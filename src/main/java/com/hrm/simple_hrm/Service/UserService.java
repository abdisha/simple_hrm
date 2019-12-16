package com.hrm.simple_hrm.Service;

import java.util.List;

import com.hrm.simple_hrm.dao.UserRepository;
import com.hrm.simple_hrm.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public boolean authenticated(String username,String password) {
      Users user =  repository.findByuserName(username);
      if(user.equals(null))
      return false;

      if(user.getPassword().equals(password)){
          return true;
      }else{
          return false;
      }
    }

	public boolean save(Users users) {
        if(repository.existsByUserName(users.getUserName())){
            return false;
        }else{
            repository.save(users);
                return true;
        }
    }
  

	public void update(String id, Users user) {
          user.setId(id);
          repository.save(user);
	}


	public void delete(String id) {
        repository.deleteById(id);
    }
    public boolean  usernameExist(String username) {
        if(repository.existsByUserName(username)){
            return true;
        }else{
            return false;
        }
    }

	public List<Users> getAll() {
		return repository.findAll();
	}
}