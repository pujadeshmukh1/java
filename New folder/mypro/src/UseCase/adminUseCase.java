package UseCase;

import java.util.List;
import java.util.Scanner;

import Dao.BatchDao;
import Dao.BatchDaoImpl;
import Dao.CourseDao;
import Dao.CourseDaoImpl;
import Dao.CoursePlanDao;
import Dao.CoursePlanDaoImpl;
import Dao.FacultyDao;
import Dao.FacultyDaoImpl;
import Exceptions.BatchException;
import Exceptions.CourseException;
import Exceptions.CoursePlanException;
import Exceptions.FacultyException;
import Extra.ConsoleColors;
import Main.Main;
import Model_JavaBeen.Batch;
import Model_JavaBeen.Course;
import Model_JavaBeen.CoursePlan;
import Model_JavaBeen.Faculty;
import Model_JavaBeen.Report;

public class adminUseCase {
	public static void adminOptions() {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println(ConsoleColors.CYAN+"Chose option");
		System.out.println("1.Course");
		System.out.println("2.Batch");
		System.out.println("3.Faculty");
		System.out.println("4.add faculty to a batch");
		System.out.println("5.Course plan");
		System.out.println("6.View the Day wise update of every batch");
		System.out.println("7.Generate Report for every batch");
		System.out.println("8.Log Out"+ConsoleColors.RESET);
		int ip=sc.nextInt();
		System.out.println();
		switch (ip) {
		case 1:{
			
			CourseDao c=new CourseDaoImpl();
			System.out.println("1.add Course");
			System.out.println("2.update Course");
			
			System.out.println("3. view all Courses");
			System.out.println("4. back");
			System.out.println();
			System.out.println("enter your choice");
			int ip1=sc.nextInt();
			System.out.println();
			
			switch (ip1) {
			case 1: {
				try {
					System.out.println(c.addCourse());;
				} catch (CourseException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());;
					System.out.println();
				}
				break;
			}
			case 2: {
				try {
					System.out.println(c.updateCourseDetails());;
				} catch (CourseException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					System.out.println();
				}
				break;
			}
			
//			List<Faculty>fl=f.getAllFacultyDetails();
//			for (Faculty faculty : fl) {
//				System.out.println(faculty);
//			}
//			adminOptions();
//			for (Faculty faculty : fl) {
//				System.out.println(faculty);
//				adminOptions();
//			}
//			} catch (FacultyException e) {
//				// TODO Auto-generated catch block
//				System.out.println();
//				System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
//				System.out.println();
//				adminOptions();
//			}
//			break;
			
			
			case 3: {
				try {
				List<Course>cl=	c.getAllCourse();
				for (Course course : cl) {
					System.out.println(course);
				}
				
				} catch (CourseException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					System.out.println(e.getMessage());
					System.out.println();
				}
				break;
			}
			case 4: {
				adminOptions();
//				System.out.println()
				
				
				
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ip1);
			}
			adminOptions();
			System.out.println();
			break;
		} 
		
		case 2:{
//			Scanner sc=new Scanner(System.in);
			
			BatchDao b=new BatchDaoImpl();
			System.out.println(ConsoleColors.CYAN+"Chose option");
			
			System.out.println("1. add batch");
			System.out.println("2. search batch by id");
			System.out.println("3. view all batch");
	//	System.out.println("4. batch delete");
			System.out.println(""+ConsoleColors.RESET);
			
			int ip2=sc.nextInt();
			switch(ip2) {
			case 1:{
				
				try {
					System.out.println(b.addBatch());
					adminOptions();
				} catch (BatchException e) {
					// TODO Auto-generated catch block
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
				break;
			}
			case 2:{
				try {
					System.out.println(b.searchBatchById());
					adminOptions();
				} catch (BatchException e) {
					// TODO Auto-generated catch block
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
				break;
			}
			case 3:{
				try {
					List<Batch> ba=b.allBatch();
					for (Batch batch : ba) {
						System.out.println(batch);
						
					}
					
				} catch (BatchException e) {
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
				adminOptions();
				break;
			}
//			case 4:{
//				try {
//					System.out.println(b.deleteBatch());;
//					adminOptions();
//				} catch (BatchException e) {
//					// TODO Auto-generated catch block
//					System.out.println(e.getMessage());
//					adminOptions();
//				}
//				
//				break;
//			}	
			}
		
			
			adminOptions();
			break;
		} 
		
		case 3:{
			System.out.println("1.add Faculty");
			System.out.println("2.update Faculty");
			
			System.out.println("3. view all Faculty");
			System.out.println("4. delete Faculty");
//			System.out.println("5. ");
			System.out.println("5. back");
			System.out.println();
			System.out.println("enter your choice");
			int ip2=sc.nextInt();
			FacultyDao f=new FacultyDaoImpl();
			switch(ip2) {
			case 1: {
				try {
					System.out.println(f.addFaculty());;
					adminOptions();
				} catch (FacultyException e) {
					// TODO Auto-generated catch block
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
			break;
			}
			case 2: {
				try {
					System.out.println(f.updateFacultyDetails());;
					adminOptions();
				} catch (FacultyException e) {
					// TODO Auto-generated catch block
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
				break;
				}
			case 3: {
				try {
				List<Faculty>fl=f.getAllFacultyDetails();
				for (Faculty faculty : fl) {
					System.out.println(faculty);
				}
				adminOptions();
				for (Faculty faculty : fl) {
					System.out.println(faculty);
					adminOptions();
				}
				} catch (FacultyException e) {
					// TODO Auto-generated catch block
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
				break;
				}
			case 4: {
				try {
					System.out.println(f.deleteFaculty());;
					adminOptions();
				} catch (FacultyException e) {
					// TODO Auto-generated catch block
					System.out.println();
					System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
					System.out.println();
					adminOptions();
				}
				break;
				}
			case 5: {
//				adminOptions();
//				System.out.println();
				CourseDao c=new CourseDaoImpl();
				adminOptions();
				break;
				}
			}
		
			System.out.println();
			adminOptions();
			break;
		} 
		
		case 4:{
			

			BatchDao b=new BatchDaoImpl();
			
			try {
				System.out.println(b.allocateFaculty());
			} catch (BatchException e) {
				// TODO Auto-generated catch block
				System.out.println();
				System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
				System.out.println();
				adminOptions();
			};
			adminOptions();
			break;
		
			
		} 
		
		case 5:{
				CoursePlanDao c=new CoursePlanDaoImpl();
				System.out.println();
				System.out.println("1. add course plan");
				System.out.println("2. update course plane satus");
				System.out.println("3. view course planes");
				System.out.println("4. update course plane topic");
				
				int ip5=sc.nextInt();
				switch (ip5) {
				case 1: {
					try {
						System.out.println(c.addCoursePlan());
					} catch (CoursePlanException e) {
						// TODO Auto-generated catch block
						System.out.println();
						System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
						System.out.println();
						adminOptions();
					}
				break;
				}
				case 2: {
					try {
						System.out.println(c.updateStatus());
					} catch (CoursePlanException e) {
						// TODO Auto-generated catch block
//						e.printStackTrace();
						System.out.println();
						System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
						System.out.println();
						adminOptions();
					}
					break;	
				}
				case 3: {
					try {
					List<CoursePlan>cp=	c.viewAllCoursePlanDateWise();
//					System.out.println(cp);
					for (CoursePlan coursePlan : cp) {
						System.out.println(coursePlan);
					}
					} catch (CoursePlanException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;	
				}case 4:{
					try {
						System.out.println(c.updateTopic());
					} catch (CoursePlanException e) {
						// TODO Auto-generated catch block
						System.out.println();
						System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
						System.out.println();
						adminOptions();
					}
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + ip5);
				}
				adminOptions();
			break;
		} 
	
		case 6:{
			CoursePlanDao c=new CoursePlanDaoImpl();
		try {	List<CoursePlan>cp=	c.viewAllCoursePlanDateWise();
//			System.out.println(cp);
			for (CoursePlan coursePlan : cp) {
				System.out.println(coursePlan);
			}
			} catch (CoursePlanException e) {
				// TODO Auto-generated catch block
				System.out.println();
				System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
				System.out.println();
				adminOptions();
			}
			adminOptions();
			break;
		} 
	
		case 7:{
					BatchDao bl=new BatchDaoImpl();
			try {
				
				
				List<Report> b=bl.generateReport();
				System.out.println();
				System.out.println(ConsoleColors.BANANA_YELLOW+"-------------------------------------------------------------------------------------------------------------------");
				System.out.printf("%13s %8s %6s %10s %10s %10s %10s %10s", " BATCH ID |", "COURSE ID |", "FACULTY NAME |", "No. Of Students |", "Starting Date |", "Duration |", "DAY PLANNED |", "DAY COMPLETED |");
				System.out.println();
				System.out.println("-------------------------------------------------------------------------------------------------------------------");
				
				for (Report report : b) {
					System.out.printf("%12s %8s %12s %15s %20s %11s %10s %12s", report.getBatchId(), report.getCourseId(),report.getFacultyFname(), report.getNoOfStudents(), report.getBatchstartDate(), report.getDuration(), report.getPlanned(), report.getCompleted());
					System.out.println();
				}
//				for( b -> {
//					System.out.printf("%12s %8s %12s %15s %20s %11s %10s %12s", b.getBatchId(), b.getCourseId(), b.getFacultyFname(), b.getNoOfStudents(), b.getBatchstartDate(), b.getDuration(), b.getPlanned(), b.getCompleted());
//					System.out.println();
//					
//				});
				System.out.println(ConsoleColors.RESET);
				
			} catch (BatchException e) {
			
				
				System.out.println();
				System.out.println(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
				System.out.println();
				adminOptions();
			}
			adminOptions();
			break;
		} 
		
		case 8:{
			Main m=new Main();
			System.out.println();
			System.out.println(ConsoleColors.TEAL+"Log Out Successfuly"+ConsoleColors.RESET);
			System.out.println();
			m.main(null);
			break;
		} 
			
		
		default:
			System.out.println("Unexpected value:" + ip);
//			throw new IllegalArgumentException("Unexpected value: " + ip);
		}
	}
	
	
	
	
}
