package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//with the help of we can make our application is webApplication and  webServices also
//@Controller 
//if we want our all method only web services then we use @@RestController 
//it is childe of Controller
@RequestMapping("/studentapp")
@RestController  //@Controller+@ResponseBody
public class MyController {

	@RequestMapping("/welcome")
	//@ResponseBody
	public String sayHello() {
		return "Wellcome to masai..";
		
	}
	
	@RequestMapping("/hi")
	//@ResponseBody
	public String sayHello2() {
		return "Wellcome to spring boot";
		
	}
	
	@RequestMapping("/student")
	public Student getStudenthandler() {
		Student stu=new Student(10, "RAm", "pune", 890);
		return stu;
	}
	
	@RequestMapping("/students")
	public List<Student> getStudentshandler() {
		List<Student> st=new ArrayList<>();
		
	st.add(new Student(10, "st1", "adr1", 890));
	st.add(new Student(20, "st2", "adr2", 790));
	st.add(new Student(30, "st3", "adr3", 690));
	st.add(new Student(40, "st4", "adr4", 590));
	st.add(new Student(50, "st5", "adr5", 490));
		return st;
	}
	
	//1. using Path variable:
	@GetMapping("/students1/{r}") 
	public Student getStudentshandler(@PathVariable("r") int roll) {
		
		//here we can find the student whose roll is supplied by the user from the DB
		//and then can return that student object to the client.
		
		//dummy object
		Student student = new Student(roll, "Ram", "delhi", 850);
		
		return student;
	}
	
	
	
	
	//sending multiple path variable:
    //http://localhost:8888/studentapp/students/10/ram/delhi
	
    @GetMapping("/students/{r}/{n}/{a}") 
    public Student getStudentshandler(@PathVariable("r") int roll, 
			@PathVariable("n") String name, 
			@PathVariable("a") String address) {
		
		//dummy object
		Student student = new Student(roll, name, address, 950);
		
		return student;
	}
    
    
    //2. using Request Parameter:
    //http://localhost:8888/studentapp/students?roll=10&name=ram&marks=600
    

@GetMapping("/students") 
	public Student getStudentshandler(@RequestParam("roll") Integer roll, 
				@RequestParam("name")String name, 
				@RequestParam(value = "marks", required = false) Integer marks) {
		
		
		//dummy object
		Student student = new Student(roll, name, "delhi", marks);
		
		return student;
	}



//**Note: Duplicate uri with same http method will not be allowed, it will thow an
//exception.

//--we can use same uri but method should be different.
//using Path variable and Request parameter together:




//--in this case, the Path variable should always comes first then only our request parameter should come.


//http://localhost:8888/studentapp/students/10?n=ram


	@GetMapping("/students/{roll}") 
	public Student getStudentshandler(@PathVariable("roll") Integer roll, 
				@RequestParam("n") String name) {
		
		
		
		//dummy object
		Student student = new Student(roll, name, "delhi",450);
		
		return student;
	}
	
	
	
	//3. sending the data using Request body:
	

		//--if we try to send the data using request body then we need to use http method either Post or Put

		//--GET and DELETE method don't have request body.


		//@PostMapping(value = "/students", consumes = MediaType.APPLICATION_JSON_VALUE)
			@PostMapping("/students")
			public String registerStudent(@RequestBody Student student) {
				
				
				//here we can connect with the DB and save the student object to the DB
				
				return "Student registered..."+student;
				
			}
			
			
			


			

}
