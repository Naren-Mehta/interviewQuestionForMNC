package collections.concurrent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class CurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<String, String>();
		hm.put("A", "Apple");
		hm.put("B", "Boy");
		hm.put("C", "Cat");
		hm.put("D", "Dog");

		Runnable r = () -> {
			System.out.println("Inside run method===>");
			try {
				Thread.sleep(2000);
				hm.put("E", "Elephant");
				System.out.println("added elephant===>");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Thread t = new Thread(r);
		t.start();
		Set s = hm.entrySet();
		Iterator i = s.iterator();

		while (i.hasNext()) {
			Map.Entry<String, String> map = (Entry<String, String>) i.next();
			System.out.println(map.getKey() + "===" + map.getValue());

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
