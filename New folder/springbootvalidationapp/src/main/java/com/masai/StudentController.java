package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

public class StudentController {


	@PostMapping("/student")
	public  ResponseEntity<String> registerStudent(@Valid @RequestBody Student student) {
		
		// SL --> DAL --->DB
		
		String result= "Student Registered Sucessfully....."+student;
 		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	
	}

}
