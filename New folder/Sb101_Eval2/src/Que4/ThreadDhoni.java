package Que4;

public class ThreadDhoni extends Thread{
     int sum = 0;
      
	 public void run() {
		 synchronized (this){
			 for(int i=1; i<=20; i++) {
				 sum+=i;
				 
			 }
			 System.out.println("inside ThreadDhoni : "+Thread.currentThread().getName()+" sum: "+sum);
		}
	 }
}
