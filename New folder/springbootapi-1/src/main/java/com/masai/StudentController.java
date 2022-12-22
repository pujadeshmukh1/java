package com.masai;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to spring boot";
	}
	
	
	@PostMapping("/stundets")
	public ResponseEntity<String> saveStudentHandker(@RequestBody Student student){
		return new ResponseEntity<String>("Save.."+student,HttpStatus.OK);
	}

}
