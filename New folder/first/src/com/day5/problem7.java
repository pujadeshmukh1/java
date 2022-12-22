package com.day5;

public class problem7 {
	int x=100;
	 static problem7 d1 =new problem7();
	 
	 public static void main(String[] args) {
		  
		 problem7 d1 = new problem7();
		  
		  d1 = null;
		  System.out.println(d1.x);
		  System.out.println(d1.d1.x);
		  System.out.println(problem7.d1.x);
		  
		  d1.d1=null;
		  problem7.d1=null;
	 }

}
