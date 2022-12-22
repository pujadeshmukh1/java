package path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://a1.txt");
		if(Files.exists(p)) {
			System.out.println("File is already exist");
		}else {
			Path p2 = Files.createFile(p);
			System.out.println("created a file at : "+p2);
		}
	}
}
