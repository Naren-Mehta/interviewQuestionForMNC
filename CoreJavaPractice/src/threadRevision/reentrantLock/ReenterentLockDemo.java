package threadRevision.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class Display{
	String name;
	ReentrantLock r= new ReentrantLock();
	
	public void wish(String name) {
		r.lock();
		for(int i=0;i<10;i++) {
			System.out.println("Good Morning ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		r.unlock();
	}
}

class MyThread extends Thread {

	Display d;
	String name;
	
	MyThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish(name);
	}
}


public class ReenterentLockDemo {

	public static void main(String[] args) {
		
		Display d= new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yovraj");

		t1.start();
		t2.start();
		
		
	}

}
