package threadRevision.reentrantLock;

public class ThreadGroupDemo {
	public static void main(String[] args) {

//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
//		
//		ThreadGroup g1 = new ThreadGroup("NarenGroup");
//		
//		
//		ThreadGroup g2 = new ThreadGroup(g1,"SinghGroup");
//
//		System.out.println(g2.getParent().getName());

		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		
		Thread[] arr= new Thread[system.activeCount()];
		
		system.enumerate(arr);
		
		for(Thread t: arr) {
			System.out.println(t.getName());
		}
		
	}
}
