package brillio;

public class ThreadSequence2 implements Runnable {

	private int valueToPrint;
	private int id;
	private static int turn = 1;
	private static int RESET_TURN_THRESHOLD = 3;

	ThreadSequence2(int id, int val) {
		this.id = id;
		this.valueToPrint = val;
	}
	
	public ThreadSequence2() {
	    this.valueToPrint = -1;
	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadSequence2(1, 1));
		t1.setName("THREAD-1");
		t1.start();
		Thread t2 = new Thread(new ThreadSequence2(2, 2));
		t2.setName("THREAD-2");
		t2.start();
		Thread t3 = new Thread(new ThreadSequence2(3, 3));
		t3.setName("THREAD-3");
		t3.start();
	}

	@Override
	public void run() {
		while (true) {
			if (turn == this.id) {
				System.out.println(Thread.currentThread().getName() + "::::" + valueToPrint);
				turn++;
			}
			if (turn > RESET_TURN_THRESHOLD) {
				turn = 1;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
