package Que4;

public class Main {
	
	public static void main(String[] args) {
		ThreadKohli kohli = new ThreadKohli();
	
	 ThreadDhoni dhoni =new ThreadDhoni();
	 
	 ThreadRohit rohit =new ThreadRohit();
	 
	 kohli.setName("Kohli");
	 dhoni.setName("Dhoni");
	 rohit.setName("Rohit");
	 
	 dhoni.setPriority(10);
	 rohit.setPriority(9);
	 
	 kohli.start();
	 dhoni.start();
	 rohit.start();
	
	}

}
