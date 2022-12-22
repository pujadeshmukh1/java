package Updatearecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll to delete the student:");
		int roll= sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try( Connection conn= DriverManager.getConnection(url,"root","1997") ) {
			
			
			PreparedStatement ps= conn.prepareStatement("delete from student where roll = ?");
			
			ps.setInt(1, roll);
			
			int x= ps.executeUpdate();
			
			if(x > 0)
				System.out.println(x+" record deleted successfully..");
			else
				System.out.println("No record deleted..");
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
	}

}