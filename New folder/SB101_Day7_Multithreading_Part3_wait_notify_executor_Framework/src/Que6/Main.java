package Que6;

import java.security.Provider.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		MyCallable [] job = {
				new MyCallable(4),
				new MyCallable(5),
				new MyCallable(8),
				new MyCallable(9),
				new MyCallable(12),
				new MyCallable(13),		
		};
		
	       ExecutorService exc = Executors.newFixedThreadPool(3);
	       
	       for(MyCallable k : job) {
              Future fut = exc.submit(k);
              System.out.println(fut.get());
	       }
	       exc.shutdown();
	}

}