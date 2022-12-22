package Quesion3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		
	       List<Integer> squares = numbers.stream() .map( i -> i*i) .collect(Collectors.toList()); 
	       System.out.println("original list of numbers : " + numbers);
	       System.out.println("transformed list of integers using Map in Java 8 : " + squares);
	       }

	
	}

