package com.masai.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

 private int courseId;
 private String courseName;
 
 private int duration;
 private int fee;
 
 @OneToMany(mappedBy = "Course", cascade = CascadeType.ALL)
 private Set<student> stu = new HashSet<student>();

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

public int getFee() {
	return fee;
}

public void setFee(int fee) {
	this.fee = fee;
}

public Set<student> getStu() {
	return stu;
}

public void setStu(Set<student> stu) {
	this.stu = stu;
}


 
 

}
