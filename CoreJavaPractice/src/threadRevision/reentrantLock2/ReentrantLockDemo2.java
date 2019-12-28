package threadRevision.reentrantLock2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {

	static ReentrantLock l = new ReentrantLock();

	public static void main(String[] args) {

		Runnable r = () -> {

			do {

				try {
					if (l.tryLock(3000, TimeUnit.MILLISECONDS)) {
						System.out.println(Thread.currentThread().getName() + " Got the thread ");
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println(Thread.currentThread().getName()+ " Releasing the lock");
						l.unlock();
						break;
					} else {
						System.out.println(Thread.currentThread().getName() +" Trying again to get the lock");
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} while (true);

		};

		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		t1.start();
		t2.start();
		
	}

}
