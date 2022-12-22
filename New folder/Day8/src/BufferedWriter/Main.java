package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("xyz.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		
		//or
		BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"));
		
		
		bw.write(100);//d will be added
		bw.newLine(); //inserting a new line
		bw.write("ramesh");
		bw.newLine();
		bw.write("india");
		bw.newLine();
		char ch[]={'a','b','c'};
		bw.write(ch);
		
		bw.flush();
		bw.close();
		System.out.println("done");
	}
	
}
