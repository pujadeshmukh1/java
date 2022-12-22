package BufferedReader_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_From_User {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter name");
	    String name =br.readLine();
	
	    System.out.println("Enter age");
	    int age = Integer.parseInt( br.readLine());
	    
	    System.out.println("Welcome : "+name);
	    
	    
	
	    System.out.println("Age is : "+age);
	    
	    
	    System.out.println("done");
	}
}
