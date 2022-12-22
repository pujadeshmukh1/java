package que2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<Product> prod = new ArrayList<>();
	prod.add(new Product(2,"Pen",10,5));
	prod.add(new Product(6,"Pencil",10,15));
	prod.add(new Product(7,"Rubber",15,25));
	prod.add(new Product(8,"Sharpener",18,3));
	prod.add(new Product(3,"Scale",20,2));
	prod.add(new Product(2,"Compass",90,1));
	
	//Filter the Products whose quantity is less than 2 using Lambda Expression
	prod.removeIf(p -> p.getQuentity() > 1);
	System.out.println(prod);
	
	//Sort the List of Products by using the price in descending order.
	Collections.sort(prod, (p1,p2) -> p1.getPrice() < p2.getPrice() ? +1 : -1);
	System.out.println(prod);
	
	//Print each element from the List by using Method Reference.
	prod.forEach(System.out::println);
}
}
