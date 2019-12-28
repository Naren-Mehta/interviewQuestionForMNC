package brillio;

public class PingPong implements Runnable {

	public static int turn = 1;
	private int id;
	private String printValue;
	private static int RESET_TURN_THRESHOLD = 2;

	private static int total = 20;
	private static int count = 0;

	public PingPong(int id, String val) {
		this.printValue = val;
		this.id = id;
	}

	@Override
	public void run() {

		while (true) {
			if (turn == this.id) {
				System.out.println(Thread.currentThread().getName() + "::::" + printValue);
				turn++;
				count++;
			}

			if (turn > RESET_TURN_THRESHOLD) {
				turn = 1;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new PingPong(1, "Ping"));
		Thread t2 = new Thread(new PingPong(2, "Pong"));
		t1.setName("THREAD-1");
		t1.start();
		t2.setName("THREAD-2");
		t2.start();
	}

}
