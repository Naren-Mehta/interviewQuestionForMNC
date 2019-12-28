package collections.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IterateList {

	public static void main(String[] args) {
		List<String> arr= new ArrayList<String>();
		arr.add("Apple");
		arr.add("Boy");
		arr.add("Cat");
		arr.add("Dog");
		arr.add("Elephant");
		
		System.out.println("1st Way to iterate=================>");
		Iterator<String> i = arr.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("\nJava 8 1st way ========================>");
		arr.forEach(a->System.out.println("Array"+ a));
		
		System.out.println("\nJava 8 2nd way ========================>");
		arr.forEach(System.out :: println);
		
		System.out.println("\nJava 8 contains / filter ========================>");
		arr.stream().filter(a-> a.contains("pp")).forEach(System.out :: println);
		
		System.out.println("\nJava 8 contains / stream ========================>");

		List newArr= arr.stream().filter(a -> a.contains("o")).collect(Collectors.toList());
		System.out.println(newArr);
	}

}
