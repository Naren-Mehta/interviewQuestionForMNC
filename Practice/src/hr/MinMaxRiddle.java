package hr;

import java.util.Stack;

public class MinMaxRiddle {

	static long[] riddle(long[] arr) {

		long[] newArr=new long[arr.length];
		
		Stack<Long> stack= new Stack<Long>();
		
		for(int i=0;i<arr.length;i++) {
			long max=0;
			for(int j=0;j<arr.length;j++) {
				if(max < arr[j]) {
					max=arr[j];
				}
			}
		}
		
		for(long l: newArr) {
			System.out.println(l);
		}
		
		return newArr;
		
	}

	public static void main(String[] args) {

		long[] arr= riddle(new long[] {1,2,3,5,1,13,3});
		
	}

}
