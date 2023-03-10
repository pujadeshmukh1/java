package CoursePlan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dao.CourseplanDao;
import Dao.CourseplanDaoImpl;
import Exceptions.CoursPlanException;
import Utility.DBconn;
import custom.ConsoleColors;

public class UpdateStatus {

	

		public static void updateStatus(int facultyId) {
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			try(Connection conn = DBconn.provideConnection()){
				
				PreparedStatement ps = conn .prepareStatement("select batchId from batch where facultyId = ?");
				
				ps.setInt(1, facultyId);
				
				ResultSet rs = ps.executeQuery();
				List<String> arr = new ArrayList<>();
				while(rs.next()) {
					arr.add(rs.getString("batchId"));
				}
				
				if(arr.size()==0) {
					System.out.println(ConsoleColors.YELLOW+facultyId + "is not Allocated to Any Batch"+ConsoleColors.RESET);
					return;
				}
				
				System.out.println(ConsoleColors.CYAN+"Choose Batch Id :"+ConsoleColors.RESET);
				for(int i = 0; i < arr.size(); i++) {
					System.out.println((i+1)+". " +arr.get(i));
				}
				
				int ch = sc.nextInt();
				String batchId = arr.get(ch-1);
				
				System.out.println(ConsoleColors.CYAN+"Enter the day no : "+ConsoleColors.RESET);
				
				int dayNo = sc.nextInt();
				
				while(true) {
				System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"Are You Sure?(Not Possible to Revert)(y/n)"+ConsoleColors.RESET);
				
					String choice = sc.next();
					if(choice.equalsIgnoreCase("y")) 
						break;
					else if(choice.equalsIgnoreCase("n"))
						return;
					else
						System.out.println(ConsoleColors.RED+"Please Enter Right Input"+ConsoleColors.RESET);
					
				}
				CourseplanDao dao = new CourseplanDaoImpl();
				
				try {
					String res = dao.updateStatus(batchId, dayNo);
					System.out.println();
					System.out.println(res);
					System.out.println();
					
				} catch (CoursPlanException e) {
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+ e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					
				}
				
			}catch (Exception e) {
				System.out.println();
				System.out.println(ConsoleColors.RED+"Please Enter Right Input"+ConsoleColors.RESET);
				System.out.println();
				updateStatus(facultyId);
			}
			
		}
		
		public static void main(String[] args) {
			updateStatus(1);
		}

	}
