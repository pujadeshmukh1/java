package Que3;

public class Main {

	
	public static void main(String[] args) throws InterruptedException {
		ThreadA a1 = new ThreadA();
		Thread t = new Thread(a1);
		ThreadB b1 = new ThreadB();
		Thread t1 = new Thread(b1);
		t.start();
		t.join();
		
		
		
		
		t1.start();
		t1.join();
	}
}
