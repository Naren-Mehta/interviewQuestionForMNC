package singleton;

class Singleton  implements Cloneable{

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		synchronized (Singleton.class) {
			if (instance == null) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
}

public class SingletonWithThread {
	static Singleton s1=null;

	public static void main(String[] args) {

		Runnable r1 = () -> {
			s1 = Singleton.getInstance();
			System.out.println(s1);
		};

		Thread t1 = new Thread(r1, "FirstThread");
		Thread t2 = new Thread(r1, "SecondThread");

		t1.start();
		t2.start();
	
	}
	
}
