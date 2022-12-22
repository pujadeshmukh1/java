package que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluationc4","root","9953")){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values (1,'kushal','himachal','kushal@gmail.com','123',3000,0)");
			
			int x = ps.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluationc4","root","9953")){
			
			PreparedStatement ps = conn.prepareStatement("select * from department");
			
			int x = ps.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	
	
	try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluationc4","root","9953")){
		
		PreparedStatement ps = conn.prepareStatement("update department set location = 'delh'");
		
		int x = ps.executeUpdate();
		
		
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
	
try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluationc4","root","9953")){
		
		PreparedStatement ps = conn.prepareStatement("update employee set password = '123456'");
		
		int x = ps.executeUpdate();
		
		
		
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
		// TODO: handle exception
	}
}
}
