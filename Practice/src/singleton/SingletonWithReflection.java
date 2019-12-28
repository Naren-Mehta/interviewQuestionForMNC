
package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton4 {

	private static Singleton4 instance = null;

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		synchronized (Singleton4.class) {
			if (instance == null) {
				instance = new Singleton4();
			}
		}
		return instance;
	}

}

public class SingletonWithReflection {
	static Singleton4 s1 = null;

	public static void main(String[] args) {

		Singleton4 s1 = Singleton4.getInstance();
		System.out.println("===" + s1);
		try {
			breakSingletonByReflection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void breakSingletonByReflection() throws ClassNotFoundException, NoSuchMethodException,
			InstantiationException, IllegalAccessException, InvocationTargetException {

		Class<?> singletonClass = Class.forName("singleton.Singleton4");
		@SuppressWarnings("unchecked")
		Constructor<Singleton4> constructor = (Constructor<Singleton4>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton4 s = constructor.newInstance();
		System.out.println(s);
	}
}