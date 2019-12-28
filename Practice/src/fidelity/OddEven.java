package fidelity;

public class OddEven implements Runnable {

	int count = 0;
	int max=50;

	public static void main(String[] args) {

		OddEven r= new OddEven();
		
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		t1.start();
		t2.start();

		
	}

	@Override
	public void run() {

		while(true) {
			synchronized (this) {
				if(count<max) {
					if (count % 2 == 0) {
						System.out.println(count+"====ping===="+Thread.currentThread().getName());
					} else {
						System.out.println("====pong===="+Thread.currentThread().getName());
					}
					count++;
				}else {
					break;
				}
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}
