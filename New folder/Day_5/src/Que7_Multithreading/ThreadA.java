package Que7_Multithreading;

public class ThreadA implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			
			String name = Thread.currentThread().getName();
			System.out.println(name +" is running ThreadA");
		}
		
	}
 
	
	
}
