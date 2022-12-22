package Que5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new 
				FileInputStream("d://studentdata.txt"));
		
		Object obj = ois.readObject();
		
		List<Student> li = (List<Student>)obj;
		
		li.forEach(i->System.out.println(i));
		ois.close();
		
		ArrayList<Student> stu = new  ArrayList<>(li);
		
		stu.add(new Student(1,"p1",200,"p1.gamil.com","p1@123",new Address("pune", "kar", "123")));
		
		ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
	
	    oos.writeObject(li);
	    oos.flush();
	    oos.close();
	
	    System.out.println("Again serialization comp after a new added");
	}

}
