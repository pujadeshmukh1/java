package FileReader_Class;


	import java.io.*;
	public class Main {
	public static void main(String[] args) throws IOException{
	FileWriter fw = new FileWriter("ab.txt");
	fw.write(100);//d will be added
	fw.write("ramesh\nwelcome");
	fw.write("\n");
	fw.write("india");
	fw.write("\n");
	char ch[]={'a','b','c'};
	fw.write(ch);
	fw.flush();
	fw.close();
	System.out.println("done");
	}
	}


