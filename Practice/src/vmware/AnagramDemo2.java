package vmware;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class AnagramDemo2 {

	public static void main(String[] args) {
		
		String s1= "abcderrxxyy";
		String s2= "rredcbayyxx";
		
		char[] arr1= s1.toCharArray();
		char[] arr2= s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(Arrays.equals(arr1,arr2));
		
		s1=String.copyValueOf(arr1);
		s2=String.copyValueOf(arr2);
		
		System.out.println(s1.equals(s2));

				
		

	}

}
