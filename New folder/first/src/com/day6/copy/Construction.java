package com.day6.copy;

public class Construction {
	
	public static void main(int i) {
		
		System.out.println("inside main(int i) of Demo");
	}
	
	
	
	public static void main(String[] args) {
		Construction d1= new Construction();
		
		main(10);
		Construction.main(20);
		new Construction().main(30);
	}
}
