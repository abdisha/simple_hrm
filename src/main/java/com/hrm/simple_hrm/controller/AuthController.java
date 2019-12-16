package com.hrm.simple_hrm.controller;

import static org.springframework.http.ResponseEntity.ok;

import java.util.HashMap;
import java.util.Map;

import com.hrm.simple_hrm.Service.CustomerDetailService;
import com.hrm.simple_hrm.config.JwtTokenProvider;
import com.hrm.simple_hrm.dao.UserRepository;
import com.hrm.simple_hrm.model.JwtResponse;
import com.hrm.simple_hrm.model.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins="*")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    UserRepository users;

    @Autowired
    private CustomerDetailService userService;

    @PostMapping("/login")
    public JwtResponse login(@RequestBody Users data) {
        try { 
            String username = data.getUserName();
           
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
            String token = jwtTokenProvider.createToken(username, this.users.findByuserName(username).getRole());
            
            return  new JwtResponse(username, token)  ;
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid User /password supplied");
        }
    }

    @SuppressWarnings("rawtypes")
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody Users user) {
        Users userExists = userService.findUserByUsername(user.getUserName());
        if (userExists != null) {
            throw new BadCredentialsException("User with username: " + user.getUserName() + " already exists");
        }
        userService.saveUser(user);
        Map<Object, Object> model = new HashMap<>();
        model.put("message", "User registered successfully");
        return ok(model);
    }
}