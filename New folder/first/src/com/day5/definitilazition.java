package com.day5;

public class definitilazition {
	int x = 100;
	definitilazition d1;
	//A a1 = new();
	public static void main(String[] args) {
		definitilazition d1 = new definitilazition();
		System.out.println(d1.d1);// null
		d1.d1=new definitilazition();
		System.out.println(d1.d1.x);
	}

}
