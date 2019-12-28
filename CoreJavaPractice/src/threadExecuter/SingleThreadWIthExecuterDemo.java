package threadExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadWIthExecuterDemo {
	public static void main(String[] args) {
		
		System.out.println("Inside: "+Thread.currentThread().getName());

		System.out.println("Creating Executer Service...");
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Runnable runnable = ()->{
			System.out.println("Child Thread.."+Thread.currentThread().getName());
		};
		
		System.out.println("Submit the task specified by the runnable to the executer service..");
		
		executorService.submit(runnable);
	}
}
