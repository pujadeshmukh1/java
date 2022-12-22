package Que3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws ExecutionException {
		
		

         ExecutorService exe= Executors.newFixedThreadPool(3);
		 List<Integer> li =Arrays.asList(1,2,3,4,5);
		 for(int j: li) {
			 Future<Long> res=  exe.submit(new ThreadPool(j));
			 try {
				 System.out.println(res.get());
			 }
			 catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
		 exe.shutdown();
	}

}
