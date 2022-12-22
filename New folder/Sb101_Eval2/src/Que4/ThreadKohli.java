package Que4;

public class ThreadKohli extends Thread{

	 public void run() {
		 synchronized (this){
			 for(int i=1; i<=10; i++) {
				 System.out.println("inside ThreadKolli : "+Thread.currentThread().getName()+" "+i);
			 }
			
		}
	 }
}
