package goldmanSachs;

import java.util.ArrayList;
import java.util.Stack;

public class FIndMinimumNumber2 {

	public static void main(String[] args) {

		System.out.println(findMinimumNumber("MNMM"));

	}

	private static int findMinimumNumber(String str) {

		Stack<Integer> stk = new Stack<Integer>();
		String result = "";

		for (int i = 0; i <= str.length(); i++) {
			stk.push(i + 1);
			
			if(i == str.length() ||  str.charAt(i) =='N' ) {
				while(!stk.isEmpty()) {
					result+=stk.pop()+" ";
				}
			}
		}

		System.out.println("==="+result);

		return 0;

	}

}
