package Que5;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	
	
	public static void main(String[] args) throws Exception {
		
		
		ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		
		List<Student> slist = Arrays.asList(
				
				new Student(1,"p1",200,"p1.gamil.com","p1@123",new Address("pune", "kar", "123")),
			    new Student(2,"p2",300,"p2.gamil.com","p2@123",new Address("mum", "kar1", "1234")),
			    new Student(3,"p3",400,"p3.gamil.com","p3@123",new Address("auran", "kar2", "1235")),
				new Student(4,"p4",500,"p4.gamil.com","p4@123",new Address("nagpur", "kar3", "1236")),
				new Student(5,"p5",600,"p5.gamil.com","p5@123",new Address("wardha", "kar3", "1237"))
				);
		
		
		oos.writeObject(slist);
		oos.flush();
		oos.close();
		
		System.out.println("serialisation complete");
		
	}
	
	
}