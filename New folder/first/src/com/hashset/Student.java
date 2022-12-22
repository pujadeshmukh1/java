package com.hashset;

public class Student {
private int roll;
private String name;
private int makes;

Student(){
	
}

public Student(int roll, String name, int makes) {
	super();
	this.roll = roll;
	this.name = name;
	this.makes = makes;
}

@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", makes=" + makes + "]";
}


}
