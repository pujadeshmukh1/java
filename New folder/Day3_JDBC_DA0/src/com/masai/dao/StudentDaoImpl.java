package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.model.Student;

import DBUtil.DBUtil;

public class StudentDaoImpl implements studentDao{

	@Override
	public String insertStudentDetails(int roll, String sname, int mark) {
		// TODO Auto-generated method stub
		String message = "Not Inserted...";
		
		try(Connection conn=DBUtil.provideConnection()){
			
		
		PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,? )");
		
	     ps.setInt(1, roll);
	     ps.setString(2, sname);
		 ps.setInt(3,mark);	
			
		 int x= ps.executeUpdate();
		 
		 if(x > 0) 
			 message = "Record Inserted Successful.....";
			 
		 
		 
		}catch(SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String insertStudentDetails2(Student student) {
		// TODO Auto-generated method stub
String message = "Not Inserted...";
		
		try(Connection conn=DBUtil.provideConnection()){
			
		
		PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,? )");
		
	     ps.setInt(1, student.getRoll());
	     ps.setString(2, student.getName());		
	     ps.setInt(3,student.getMarks());		
		 int x= ps.executeUpdate();
		 
		 if(x > 0) 
			 message = "Record Inserted Successful.....";
			 
		 
		 
		}catch(SQLException e) {
			message=e.getMessage();
		}
		
		return message;
	}

}
