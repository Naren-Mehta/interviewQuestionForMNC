package threadRevision.reentrantLock1;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {
	
	static ReentrantLock l= new ReentrantLock();
	
	public static void main(String[] args) {
		
		
		Runnable r = ()->{
			
			if(l.tryLock()) {
				System.out.println("Got the lock "+Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
					System.out.println("Releasing lock "+Thread.currentThread().getName());
					l.unlock();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("Didn't get the lock "+Thread.currentThread().getName());
				System.out.println("Doing another work");
			}
			
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
		
		try {
			Thread.sleep(4000);
			Thread t3 = new Thread(r);
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
