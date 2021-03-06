package threadExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleThreadWithExecuterDemo {

	public static void main(String[] args) {
		System.out.println("Inside: "+Thread.currentThread().getName());
		
		Runnable task1 =()->{
			System.out.println(" Task1 "+Thread.currentThread().getName());
		};
		
		Runnable task2 =()->{
			System.out.println(" Task2 "+Thread.currentThread().getName());
		};
		
		Runnable task3 =()->{
			System.out.println(" Task3 "+Thread.currentThread().getName());
		};
		
		System.out.println("===========");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(task1);
		service.submit(task2);
		service.submit(task3);

	}

}
