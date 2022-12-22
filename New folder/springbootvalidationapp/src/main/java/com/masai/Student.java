package com.masai;

public class Student {

	private Integer roll;
	private String name;
	
	private String address;
	private String email;
	private Integer marks;
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stundent [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + ", marks="
				+ marks + "]";
	}
	
	
	
	 
}
