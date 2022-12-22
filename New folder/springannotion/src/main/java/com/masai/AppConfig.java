package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	
	//or
	@Bean("clist")
	public List<String> getCities(){
	List<String> cities = new ArrayList<String>();
	cities.add("delhi");
	cities.add("chennai");
	cities.add("mumbai");
	cities.add("kolkata");
	return cities;
	}

	
}
