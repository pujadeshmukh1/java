package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		A obj = ctx.getBean("a",A.class);
		obj.funA();
		((AnnotationConfigApplicationContext)ctx).close();
		}

}
//
//incase of XML based configuration file:-
//ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//incase of annotation-based configuration class:-
//ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);