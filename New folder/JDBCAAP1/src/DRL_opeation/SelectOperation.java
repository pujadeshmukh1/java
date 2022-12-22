package DRL_opeation;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class SelectOperation {
		
		
		public static void main(String[] args) {
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			String url = "jdbc:mysql://localhost:3306/web20sb101db";
			
			try( Connection conn= DriverManager.getConnection(url,"root","1997") ) {
				
				PreparedStatement ps= conn.prepareStatement("select * from student");
				
				ResultSet rs= ps.executeQuery();
				
				while(rs.next()) {
					
					int r= rs.getInt("roll");
					String n= rs.getString("sname");
					int m= rs.getInt("marks");
					
					System.out.println("Roll is :"+r);
					System.out.println("Name is :"+n);
					System.out.println("Marks is :"+m);
					
					System.out.println("=========================");
					
				}
				
				
				
				
				
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}