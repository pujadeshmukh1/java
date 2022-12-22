package Quesion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	
	
	

	public static void main(String[] args) {
		
		List<Product> pro= new ArrayList<>();
		
		pro.add(new Product(10,"pen",10,8));
		pro.add(new Product(11,"pencial",5,12));
		pro.add(new Product(12,"book",30,14));
		pro.add(new Product(13,"noteBook",40,10));
		pro.add(new Product(14,"eraser",3,20));
		
		
		//Stream<Product> str1= pro.stream();
//		
//		Stream<Student> str2= str1..filter(s -> s.getMarks() < 500);
//		
//		List<Student> filteredList= str2.collect(Collectors.toList());
//		
		
		List<Product> filteredList= pro.stream()
					.filter(s -> s.getQuantity() > 10).collect(Collectors.toList());
		filteredList.forEach(s -> System.out.println(s));
		System.out.println("=============================================================================");
		
		
		Collections.sort(pro,(s1,s2)->s1.getPrice()>s2.getPrice()? +1 :-1);
		pro.forEach(s->System.out.println(s));
		
		System.out.println("================================================================================");
		
		
		pro.forEach(s->System.out.println(s));
	}

}
