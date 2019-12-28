package collections.concurrent;

import java.io.Console;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Apple");
		hm.put("B", "Boy");
		hm.put("C", "Cat");
		hm.put("D", "Dog");
		
		//1st way
		System.out.println("===1st way to iterate ");

		for(Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		
		// 2nd way
		System.out.println("\n===2nd way to iterate ");
		
		Set<Entry<String, String>> s = hm.entrySet();
		Iterator<Entry<String, String>> i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry<String, String> entry=  i.next();
			System.out.println(entry.getKey() +" "+entry.getValue());

		}
		
		System.out.println("\nVia java 8: =====================");
		
		hm.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
