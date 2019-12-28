package singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton3 implements Serializable {

	private static Singleton3 instance = null;

	private Singleton3() {
	}

	public static Singleton3 getInstance() {
		synchronized (Singleton3.class) {
			if (instance == null) {
				instance = new Singleton3();
			}
		}
		return instance;
	}
	
	// implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    } 


}

public class SingletonWithSerialization {
	static Singleton3 s1 = null;

	public static void main(String[] args) {

		Singleton3 s1 = Singleton3.getInstance();
		System.out.println("===" + s1);
		try {
			breakSingletonByserialization(s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void breakSingletonByserialization(Singleton3 orginalsingleton)
			throws FileNotFoundException, IOException, ClassNotFoundException {

		/**
		 * Serialization
		 */
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Singleton.ser"));
		outputStream.writeObject(orginalsingleton);
		outputStream.close();

		/**
		 * DeSerialization
		 */
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Singleton.ser"));

		Singleton3 deserializeObject = (Singleton3) inputStream.readObject();
		System.out.println("====" + deserializeObject);
		deserializeObject.hashCode();

	}
}
