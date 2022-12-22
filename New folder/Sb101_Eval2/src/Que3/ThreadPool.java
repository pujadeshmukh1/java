package Que3;

import java.util.concurrent.Callable;

public class ThreadPool implements Callable<Long>{
	
	
	long number;

	public ThreadPool(long number) {
		this.number=number;
	}

	@Override
	public Long call() throws Exception {
		synchronized(this) {
			long pro=1;
			for(int i=1; i<=number; i++) {
				pro*=i;
			}
			System.out.println("inside ThreadPool : "+Thread.currentThread().getName());
			return pro;
		}
	}

}
