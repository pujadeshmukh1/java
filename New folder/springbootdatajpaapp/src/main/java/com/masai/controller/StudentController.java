package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.model.StudentDTO;
import com.masai.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){
		
		
		Student registerdStudent= service.registerStudent(student);
		
		return new ResponseEntity<Student>(registerdStudent, HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/students/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll){
		
		Student student= service.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentHandler(){
		
		List<Student> students= service.getAllStudentDetails();
		
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/students/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable("roll") Integer roll){
		
		Student deletedStudent= service.deleteStudentByRoll(roll);
		
		return new ResponseEntity<Student>(deletedStudent, HttpStatus.OK);
		
		
	}
	
	
	@PutMapping("/students")
	public ResponseEntity<Student> updateStudentHandler(@RequestBody Student student){
		
		Student updatedStudent= service.updateStudentDetails(student);
		
		return new ResponseEntity<Student>(updatedStudent,HttpStatus.ACCEPTED);
		
	}
	

	//localhost:8088/students/1?gMarks=80
	
	@PutMapping("/students/{roll}")
	public ResponseEntity<Student> updateStudentMarksByRollHandler(@PathVariable("roll") Integer roll, @RequestParam("gMarks") Integer gMarks){
		
		
		Student updatedStudent= service.updateStudentMarksByRoll(roll, gMarks);
		
		return new ResponseEntity<Student>(updatedStudent, HttpStatus.ACCEPTED);
		
	}
	
	
	@GetMapping("/getstudents/{address}")
	public ResponseEntity<List<Student>> getStudentsByAddressHandler(@PathVariable("address") String address){
		
		
		List<Student> students= service.getStudentsByAddress(address);
		
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getstudentbymarks/{marks}")
	public ResponseEntity<Student> getStudentByMarksHandler(@PathVariable("marks") Integer marks){
		
		
		Student student= service.getStudentByMarks(marks);
		
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	
	@GetMapping("/getnamebyroll/{roll}")
	public ResponseEntity<String> getStudentNameByRollHandler(@PathVariable("roll") Integer roll){
		
		
		String name= service.getStudentNameByRoll(roll);
		
		
		return new ResponseEntity<String>(name,HttpStatus.OK);
	}
	
	@GetMapping("/getNameMarksByAddress/{address}")
	public ResponseEntity<List<String>> getStudentNameMarksByAddressHandler(@PathVariable("address") String address){
		
		
		List<String> results = service.getStudentNameAndMarksByAddress(address);
		
		
		return new ResponseEntity<List<String>>(results,HttpStatus.OK);
	}
	
	@GetMapping("/getNameMarksDTOByAddress/{address}")
	public ResponseEntity<List<StudentDTO>> getStudentNameMarksByAddressHandler2(@PathVariable("address") String address){
		
		
		List<StudentDTO> dtos = service.getStudentNameAndMarksByAddress2(address);
		
		
		return new ResponseEntity<List<StudentDTO>>(dtos,HttpStatus.OK);
	}
	
	
}
