package com.hrm.simple_hrm.controller;

import java.util.List;

import com.hrm.simple_hrm.Service.UserService;
import com.hrm.simple_hrm.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * UserController
 */
@RestController
@CrossOrigin(origins="*")

public class UserController {

   @Autowired
    private UserService userService;

    //craete User

    @PostMapping("/user")
    public boolean create(@RequestBody Users users) {

        return userService.save(users);
      
      }
    
    //Authenticate
    @GetMapping(value="/login")
    public boolean login(@RequestParam String username ,@RequestParam String password ) {
         return userService.authenticated(username, password);
    }
    
   @PutMapping(value="update/lockorunlock/{id}")
   public Users update(@PathVariable String id, @RequestBody Users user) {
       
        userService.update(id,user);
        return user;
   }
   
   @DeleteMapping(value = "/delete")
   public void delete(@PathVariable String id){
     userService.delete(id);
   }
    

   @GetMapping(value="/user")
   public List<Users>  getUsers() {
       return userService.getAll();
   }
   

}
