package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Exceptions.BatchException;

import JavaBean.Batch;
import Utility.DBconn;
import custom.ConsoleColors;

public class BatchDaoImpl implements BatchDao{

	
	// Add New Batch into Database
	@Override
	public String addBatch(Batch batch) throws BatchException {
		
		String message = ConsoleColors.RED+"Data Not Inserted..."+ConsoleColors.RESET;

		try(Connection conn = DBconn.provideConnection()){

			PreparedStatement ps = conn .prepareStatement("select courseName from course where courseId = ?");

			ps.setInt(1, batch.getCourseId());

			ResultSet rs = ps.executeQuery();

			String cName = "";
			if(rs.next()) {
				cName = rs.getString("courseName");

			}else {
				throw new BatchException(ConsoleColors.RED_BACKGROUND+"Course Id does not exist."+ConsoleColors.RESET);
			}


			PreparedStatement ps1 = conn .prepareStatement("select count(courseId) from Batch where courseId = ?");

			ps1.setInt(1, batch.getCourseId());

			ResultSet rs1 = ps1.executeQuery();


			int count = 0;
			if(rs1.next()) {
				count = rs1.getInt(1);
			}else {
				throw new BatchException(ConsoleColors.RED_BACKGROUND+"Course Id does not exist."+ConsoleColors.RESET);
			}

			count++;
			String text = String.format("%03d", count);

			String batchId = cName + text;

			PreparedStatement ps2 = conn .prepareStatement("insert into Batch(batchId, courseId, noOfStudents, batchstartDate, duration) values(?,?,?,?,?)");

			ps2.setString(1, batchId);
			ps2.setInt(2, batch.getCourseId());
			ps2.setInt(3,batch.getNumberofStudents());
			ps2.setString(4, batch.getBatchstartDate());
			ps2.setString(5, batch.getDuration());

			int x = ps2.executeUpdate();

			if(x>0) {
				message = ConsoleColors.GREEN+"New Course Added Successfully.."+ConsoleColors.RESET;

			}else {
				throw new BatchException(ConsoleColors.RED_BACKGROUND+"Duplicate Entry"+ConsoleColors.RESET);

			}

		}catch(SQLException e) {

			throw new BatchException(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);

		}

		return message;
	}

	
	
	
	// Search Batch With Name
	@Override
	public List<Batch> searchBatchByName(String name) throws BatchException {
		
		List<Batch> batches = new ArrayList<>();
		
		try(Connection conn = DBconn.provideConnection()){
			
			
			PreparedStatement ps = conn .prepareStatement("Select b.batchId, b.courseId, b.facultyId,  b.getNumberofStudents, b.batchstartDate, b.duration from Batch b, Faculty f where b.courseId = ("
					+ "Select courseId from course where courseName = ?) and b.facultyID = f.facultyID");
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {		
				String bid = rs.getString("batchId");
				int cid = rs.getInt("courseId");
				int fid = rs.getInt("facultyId");
				String fName = rs.getString("facultyFname");
				int nos = rs.getInt("noOfStudents");
				Date date = rs.getDate("batchstartDate");
				String dur = rs.getString("duration");
				
				String sDate = date.toString();
				
				Batch batch = new Batch(bid,cid,fid,fName,nos,sDate,dur);

				
				batches.add(batch);
			}
			if(batches.size() == 0)
				throw new BatchException(ConsoleColors.RED_BACKGROUND+"Batch does not exist with this name "+ name + "."+ConsoleColors.RESET);
			
		}catch(SQLException e) {
			
			throw new BatchException(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
			
		}
		
		return batches;
	}




	@Override
	public Batch SearchBatchById(int batchId) throws BatchException {
    
		Batch batch = null;
		
		try(Connection conn = DBconn.provideConnection()){
			
			
			PreparedStatement ps = conn .prepareStatement("Select * from Batch where batchId = ?");
			
			ps.setInt(1, batchId);
			
			ResultSet rs = ps.executeQuery();
			
		
			if(rs.next()) {		
				String bid = rs.getString("batchId");
				int cid = rs.getInt("courseId");
				int fid = rs.getInt("facultyId");
			
				int nos = rs.getInt("numberofStudents");
				Date date = rs.getDate("batchstartDate");
				String dur = rs.getString("duration");
				
				String sDate = date.toString();
				
				new Batch(bid,cid,fid,nos,sDate,dur);

				
			}else
			
				throw new BatchException(ConsoleColors.RED_BACKGROUND+"Faculty does not exist with this id "+ batch + "."+ConsoleColors.RESET);
			
		}catch(SQLException e) {
//			e.printStackTrace();
			
			throw new BatchException(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
		}
		
		return batch;
	}




	@Override
	public List<Batch> allBatch() throws BatchException {

		List<Batch> batches = new ArrayList<>();
		
		try(Connection conn = DBconn.provideConnection()){
					
			PreparedStatement ps = conn .prepareStatement("Select b.batchId, b.courseId, b.facultyId, b.numberofStudents, b.batchstartDate, b.duration  from Batch b , Faculty f where b.facultyID = f.facultyID;");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {		
				String bid = rs.getString("batchId");
				int cid = rs.getInt("courseId");
				int fid = rs.getInt("facultyId");
				int nos = rs.getInt("numberofStudents");
				Date date = rs.getDate("batchstartDate");
				String dur = rs.getString("duration");
				
				String sDate = date.toString();
				
				Batch batch = new Batch(bid,cid,fid,nos,sDate,dur);
//				System.out.println(batch);
				
				batches.add(batch);
			}
			if(batches.size() == 0)
				throw new BatchException(ConsoleColors.RED_BACKGROUND+"Batch does not exist."+ConsoleColors.RESET);
			
		}catch(SQLException e) {
			
			throw new BatchException(ConsoleColors.RED_BACKGROUND+e.getMessage()+ConsoleColors.RESET);
			
		}
		
		return batches;
	}








}