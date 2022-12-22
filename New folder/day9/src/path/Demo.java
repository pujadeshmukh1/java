package path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://a2.txt");
	
	String msg="WElcome to java";
	//writing a normal string
	Files.write(p, msg.getBytes());
	
	List<String> list = Arrays.asList("del","mum","kol");
	
	//Files.write(p,list);  //its give only new data on list
	
	//in append mode
	Files.write(p,list,StandardOpenOption.APPEND);
	
	System.out.println("done...........");
	}

}
