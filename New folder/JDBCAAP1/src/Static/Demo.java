package Static;

public class Demo {

	public static void main(String[] args) {
		
	
			try {
				Class.forName("Static.A");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
