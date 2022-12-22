package Fileclass;

import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("abc.txt",true);
		
		fw.write(102);

		fw.write("Welcome");
		fw.write("\n");
		fw.write("Welcome\nIndia");
		fw.write("\n");
		char ch[]= {'a','b','c'};
		fw.write(ch);
		
		System.out.println("Done...");
		
		//in our abc.txt is empty after writing flush(); its not emt
		
		fw.flush();
		
		fw.close();
	}
	
}