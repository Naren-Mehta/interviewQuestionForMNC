package hr;

import java.util.Stack;

public class LargestRectangle {
	

	static long largestRectangle(int[] h) {
		
		Stack<Integer> stack= new Stack<Integer>();
		long max=0;
		int i;
		for(i=0;i<h.length;i++) {
			if(!stack.isEmpty()) {
				if(h[stack.peek()]<h[i]) {
					stack.push(i);
				}else {
					int x= stack.pop();
					int newMax;
					if(stack.isEmpty()) {
						 newMax=h[x] * i;
					}else {
						 newMax=h[x] * (i-stack.peek()-1);
					}
					if(newMax>max) {
						max=newMax;
					}
					System.out.println(x+"==else newMax=="+newMax);
					stack.push(i);
				}
			}else {
				stack.push(i);
			}
		}
		
		while(!stack.isEmpty()) {
			int x= stack.pop();
			int newMax;
			if(stack.isEmpty()) {
				 newMax=h[x] * i;
			}else {
				 newMax=h[x] * (i-stack.peek()-1);
			}
			
			System.out.println(x+"==newMax=="+newMax);
			
			if(newMax>max) {
				max=newMax;
			}
			
			System.out.println();
		}
		
		return max;
	}

	public static void main(String[] args) {
		System.out.println(largestRectangle(new int[] {8979, 4570, 6436, 5083, 7780, 
				3269, 5400, 7579, 2324, 2116}));
	}

}
