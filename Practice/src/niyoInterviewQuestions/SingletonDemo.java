package niyoInterviewQuestions;

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
	
	@Override
	public Object clone() throws CloneNotSupportedException{
	    return new CloneNotSupportedException();
	}
}

public class SingletonDemo {
	static Singleton s1=null;

	public static void main(String[] args) {

		Runnable r1 = () -> {
			s1 = Singleton.getInstance();
		};

		Thread t1 = new Thread(r1, "FirstThread");
		Thread t2 = new Thread(r1, "SecondThread");

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
			System.out.println(s1);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			breakSingletonByCloning(s1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	private static void breakSingletonByCloning(Singleton orginalSingletonObject) throws CloneNotSupportedException {
	    Singleton clonedSingletonObject=(Singleton) orginalSingletonObject.clone();
		System.out.println(clonedSingletonObject);

	}
}
