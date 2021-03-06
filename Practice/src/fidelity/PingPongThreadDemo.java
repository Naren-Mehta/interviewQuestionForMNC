package fidelity;

public class PingPongThreadDemo implements Runnable {

	String name = "Ping";
	int maxCount = 10;
	int count = 0;

	public void run() {
		while (true) {
			if (count < maxCount) {
				playTurn();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count++;
			} else {
				count = 0;
				break;
			}

		}
	}

	public void playTurn() {
		try {

			synchronized (this) {

				if (name.equals("Ping")) {
					System.out.println("Ping " + Thread.currentThread().getName());
					name = "Pong";
					
				} else {
					System.out.println("Pong " + Thread.currentThread().getName());
					name = "Ping";
				}
				
				count++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		PingPongThreadDemo r = new PingPongThreadDemo();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();

	}

}
