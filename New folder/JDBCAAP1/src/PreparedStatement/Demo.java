package PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;


public class Demo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Roll :");
		int roll= sc.nextInt();
		
		System.out.println("Enter Name :");
		String name= sc.next();
		
		System.out.println("Enter Marks :");
		int marks= sc.nextInt();
		
		
		
		
		
		
		//Loading the Driver related main class into the memory
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		
		try (Connection conn=  DriverManager.getConnection(url,"root","1997")){
			
			
			PreparedStatement ps= conn.prepareStatement("insert into student values(?,?,?)");
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setInt(3, marks);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				System.out.println("recored inserted successfully..!");
			else
				System.out.println("fails...");
			
			
			
			
			
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
