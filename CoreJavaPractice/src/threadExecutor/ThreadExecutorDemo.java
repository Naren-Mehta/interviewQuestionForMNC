package threadExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyJob implements Callable{
	int[] arr;

	public MyJob(int[] arr) {
		this.arr = arr;
	}

	@Override
	public Object call() throws Exception {
		Integer sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}

//		System.out.println(sum);
		return sum;
	}
}

public class ThreadExecutorDemo {
	public static void main(String[] args) {
		
		MyJob[] jobArr = {new MyJob(new int[] {10,20}), new MyJob(new int[] {100,200})};
		
		
		
		ExecutorService es= Executors.newFixedThreadPool(2);
		Integer sumOfTwoArr=0;
		for(MyJob job : jobArr ) {
			Future f= es.submit(job);
			try {
				System.out.println("====="+f.get());
				sumOfTwoArr=sumOfTwoArr + (Integer) f.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}			
		}
		es.shutdown();

		System.out.println(sumOfTwoArr);
	}
}
