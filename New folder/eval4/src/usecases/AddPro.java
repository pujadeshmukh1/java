package usecases;

import java.util.Scanner;


import com.masai.ProductDaoImpl;
import com.masai.productDao;

import Mod.product;

public class AddPro {

	

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter productId :");
		int productId= sc.nextInt();
		
		System.out.println("Enter productName :");
		String productName= sc.next();
		
		System.out.println("Enter price :");
		int price= sc.nextInt();
		
		System.out.println("Enter quantity :");
		int quantity= sc.nextInt();
		
		
		
		productDao dao = new ProductDaoImpl();

		
	
	//Student student = new Student(roll, name, marks);
	product product = new Mod.product(productId, productName, price, quantity);
		
		String result= dao.addProduct(product);
		
		System.out.println(result);
		
		
	}
	
	
}
