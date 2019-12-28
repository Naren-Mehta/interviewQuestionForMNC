package passByValue;

import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public  void swap(String a, String b) {
//		String temp=obj1;
//		obj1=obj2;
//		obj2=temp;
		
		a="naren";
		b="mehta";
		
		System.out.println(a+ " "+b);
		
		
		
	}
	
	public void reverse(int[] arr) {
		
		int[] newArr= new int[arr.length];
		int j=0;
		for(int i=arr.length-1 ; i>=0;i--) {
			newArr[j]= arr[i];
			j++;
		}
		
		arr=newArr;
		System.out.println("====modified====");
		print(arr);
		System.out.println("====modified====");


		
	}
	
	public static void main(String[] args) {
		
		Demo d= new Demo();
//		String a= "Hello";
//		String b= "Hi";
//		
//		d.swap(a, b);
//		
//		System.out.println(a+"=="+b);
		
		int[] arr= {6,5,4,3,2,1};
		
		print(arr);
		d.reverse(arr);
		print(arr);
		
	}
	
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
}
