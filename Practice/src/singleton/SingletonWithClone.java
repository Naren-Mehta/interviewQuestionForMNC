package singleton;

class Singleton1 implements Cloneable {

	private static Singleton1 instance = null;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		synchronized (Singleton1.class) {
			if (instance == null) {
				instance = new Singleton1();
			}
		}
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
		return new CloneNotSupportedException();
	}
}

public class SingletonWithClone {
	static Singleton1 s1 = null;

	public static void main(String[] args) {

		Singleton1 s1 = Singleton1.getInstance();
		try {
			Singleton1 s2 = (Singleton1) s1.clone();
			
			System.out.println(s1);
			System.out.println(s2);

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
