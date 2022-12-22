package ClosingTheConnecton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
public static void main(String[] args) {
		
		//Loading the Driver related main class into the memory
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		Connection conn = null;
		
		try {
			conn=  DriverManager.getConnection(url,"root","1997");
			
			Statement st= conn.createStatement();
			
			int x= st.executeUpdate("insert into student values(10,'Ram',780)");
			
			if(x > 0)
				System.out.println(x+" recored inserted sucessfully..!");
			else
				System.out.println("insertion fails..");
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
