package FileReader_Class;
import java.io.*;
public class Main1 {


	public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("d://ab.txt");
	int i=fr.read();
	while( i != -1) {
	System.out.print((char) i);
	i = fr.read();
	}
	}
	}


