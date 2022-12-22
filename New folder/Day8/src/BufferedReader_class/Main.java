package BufferedReader_class;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new FileReader("d://ab.txt"));
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
		}
		System.out.println("done");
	}

}
