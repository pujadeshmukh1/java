package ques4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List<Product> pro = new  ArrayList<>();
		pro.add(new Product(1, "sugar", 4, 640));
		pro.add(new Product(2, "sugar3", 5, 170));
		pro.add(new Product(4, "sugar4", 6, 470));
		pro.add(new Product(5, "sugar6", 8, 240));
		pro.add(new Product(7, "sugar5", 9, 340));
		
		Collections.sort(pro, (s1,s2) -> s1.getPrice() < s2.getPrice() ? +1 : -1 );
		
		System.out.println(pro);
	}

}
