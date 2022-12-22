package com.masai.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Course {
	
	 @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	private int courseId;
	private String courseName;
	private String duration;
	private int fee;
	 
	
	@OneToMany(cascade= CascadeType.ALL)
	//@JoinTable(name="Course", joinColumns = @JoinColumn(name="courseId"), inverseJoinColumns = @JoinColumn(name="rollNo"))
	//joinColumns=@JoinColumn(),inverseJoinColumns=@JoinColumn(name="rollNo")
	List<Student> list =new ArrayList<Student>();
	 //@ManyToMany(cascade = CascadeType.ALL,mappedBy="course")
	
	
	public Course() {
		super();
	}

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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Course(int courseId, String courseName, String duration, int fee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		
		
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ "]";
	}
}