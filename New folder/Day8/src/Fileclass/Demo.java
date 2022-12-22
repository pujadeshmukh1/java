package Fileclass;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abcd.txt",true);
		
		fw.write(102);
		
		System.out.println("Done...");
		
		//in our abc.txt is empty after writing flush(); its not emt
		
		fw.flush();
		
		fw.close();
	}
	
}