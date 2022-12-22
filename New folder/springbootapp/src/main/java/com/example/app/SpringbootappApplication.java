package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.p1.B;

@SpringBootApplication

//@ComponentScan(basePackages="com.p1")
public class SpringbootappApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringbootappApplication.class, args);
	
	A obj=    ctx.getBean("a", A.class);
	
	obj.funA();
	
	}
	
	///if we want accese other pagakage class (@ComponentScan(basePackages="com.p1"))
	
//	public static void main(String[] args) {
//		ApplicationContext ctx=	SpringApplication.run(SpringbootappApplication.class, args);
//		
//		B obj=ctx.getBean("b", B.class);
//		
//		obj.funB();
//		
//		}
	

}
