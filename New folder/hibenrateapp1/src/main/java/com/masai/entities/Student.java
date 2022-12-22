package com.masai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mystudents")
public class Student {
	
	@Id
	@Column(name = "sroll")
	private int roll;
	
	@Column(name = "smarks")
	private int marks;
	private String name;
	public Student() {
	// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	}
	public int getRoll() {
	return roll;
	}
	public void setRoll(int roll) {
	this.roll = roll;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getMarks() {
	return marks;
	}
	public void setMarks(int marks) {
	this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
}
