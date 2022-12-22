package path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLine {

	
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d://a2.txt");
		List<String> list = Files.readAllLines(p);
		
		System.out.println("Reading from the File");
		
		for(String line:list) {
			System.out.println(line);
		}
		
	}
}
