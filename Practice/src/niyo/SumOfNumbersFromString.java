package niyo;

import java.util.HashMap;

public class SumOfNumbersFromString {

	public static void main(String[] args) {

//		String str="a1b2c3a111b222c333";
		String str = "a1234b2c3a111b222c333";

		char[] arr = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!Character.isDigit(ch)) {
				String numStr = "";

				while (i+1 < arr.length && Character.isDigit(arr[i+1])) {
					numStr = numStr + arr[i+1];
					i++;
				}
				i=i-1;
				
				int number = Integer.parseInt(numStr);
				if (hm.containsKey(ch)) {

					int sum = hm.get(ch);
					sum = sum + number;
					hm.put(ch, sum);

				} else {
					hm.put(ch, number);

				}

			}
		}
		System.out.println(hm);


	}

}