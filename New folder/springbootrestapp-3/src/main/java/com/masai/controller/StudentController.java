package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InvalidRollNumberException;
import com.masai.model.Student;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {

	private List<Student> students = new ArrayList<>();

	@PostConstruct
	public void setupStudents() {

		students.add(new Student(10, "Ram", "delhi", 700));
		students.add(new Student(12, "Ravi", "chennai", 720));
		students.add(new Student(13, "Ramesh", "mumbai", 740));
		students.add(new Student(14, "Pawan", "delhi", 800));

	}

//	@GetMapping("/students")
//	public List<Student> getAllStudentsHandler() {
//
//		return students;
//
//	}
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentsHandler() {

		//return students;

		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
//	@GetMapping("/getStudent/{roll}")
//	public Student getStudentDetails(@PathVariable("roll") Integer roll) {
//	if(roll >100)
//	throw new IllegalArgumentException("Roll number should be less  than 100");
//	return new Student(roll, "suresh","adr1",988);
//	}
	
	@GetMapping("/getStudent/{roll}")
	public Student getStudentDetails(@PathVariable("roll") Integer roll) throws InvalidRollNumberException {
	if(roll >100)
	throw new InvalidRollNumberException("Roll number should be less  than 100");
int x=roll/0;
	return new Student(roll, "suresh","adr1",988);
	}

	
//	@PostMapping("/students")
//	public Student registerStudentHandler(@RequestBody Student student) {
//
//		students.add(student);
//
//		return student;
//
//	}
	
	
	@PostMapping("/students")
	public  ResponseEntity<Student> registerStudentHandler(@RequestBody Student student) {

		students.add(student);

		HttpHeaders hh = new HttpHeaders();
		hh.add("abc", "xyz");
		hh.add("Authorization", "jwttoken");
		hh.add("role", "admin");
		
		
return new ResponseEntity<Student>(student, hh,HttpStatus.CREATED); // with response headers
		
//return new ResponseEntity<Student>(student,HttpStatus.OK); //without response headers

}
	
	
	
	
	
	

	@GetMapping("/students/{roll}")
	public Student getStudentHandler(@PathVariable("roll") Integer roll) {

		Student s = null;

		for (Student student : students) {
			if (student.getRoll() == roll)
				s = student;
		}

		if (s != null)
			return s;
		else
			throw new IllegalArgumentException("Student does not exist with Roll :" + roll);

	}

	@DeleteMapping("/students/{roll}")
	public String deleteStudentHandler(@PathVariable("roll") Integer roll) {

		boolean flag = true;

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getRoll() == roll) {
				students.remove(i);
				flag = false;
				break;
			}

		}

		if (!flag)
			return "Student Deleted Sucessfully..";
		else
			throw new IllegalArgumentException("Student does not exist with roll :" + roll);

	}

	@PutMapping("/students/{roll}")
	public Student updateStudentHandler(@RequestBody Student student, @PathVariable("roll") Integer roll) {

		boolean flag = true;

		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getRoll() == roll) {

				Student existingStudent = students.get(i);

				// existingStudent = student;

				existingStudent.setName(student.getName());
				existingStudent.setAddress(student.getAddress());
				existingStudent.setMarks(student.getMarks());

				flag = false;
				return existingStudent;
			}

		}

		if (flag)
			throw new IllegalArgumentException("Student does not exist with Roll :" + roll);

		return null;

	}
}
