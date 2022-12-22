package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
//	@Qualifier(value="b5")
	private B b1;

	
//	or
//	@Autowired
//	public A(B b1) {
//		super();
//		this.b1 = b1;
//	}
	
// 	or we can Autowired in setter method

	
	@Autowired
	List<String> cities;

	@PostConstruct
	public void mySetUp() {
		System.out.println("inside mysetup....");
	}


	public B getB1() {
		return b1;
	}


	public void setB1(B b1) {
		this.b1 = b1;
	}


	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy....");
	}


	public void funA() {
		System.out.println("inside funA");
	    System.out.println(b1);
	    System.out.println(cities);
	}
}
