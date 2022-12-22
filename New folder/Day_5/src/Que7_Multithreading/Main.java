package Que7_Multithreading;

public class Main {

	public static void main(String[] args) {
		
		ThreadA td1 = new ThreadA();
		ThreadB td2 = new ThreadB();
		
		Thread tr1 = new Thread(td1);
		Thread tr2 = new Thread(td2);
		
		tr1.setName("kholi");
		tr2.setName("dhoni");
		
		tr1.setPriority(8);
		tr1.setPriority(10);
		
		tr1.getPriority();
		tr2.getPriority();
		
		tr1.start();
		tr2.start();
		
		

	}

}
