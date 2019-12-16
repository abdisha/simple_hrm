package com.hrm.simple_hrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableSwagger2
@EnableMongoRepositories("com.hrm.simple_hrm.dao")
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}
	

	
}
