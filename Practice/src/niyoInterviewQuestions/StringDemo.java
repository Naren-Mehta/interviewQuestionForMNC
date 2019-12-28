package niyoInterviewQuestions;

import java.util.HashMap;

public class StringDemo {

	public static void main(String[] args) {

		String str = "a1b2c345d56a44d33e667c40b22";
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!Character.isDigit(arr[i])) {
				char key = arr[i];
				String sum = "";
				while ((i + 1 < arr.length) && Character.isDigit(arr[i + 1])) {
					sum = sum + arr[i+1];
					i++;
				}
				if (!hm.containsKey(key)) {
					hm.put(key, Integer.parseInt(sum));
				} else {
					Integer value = hm.get(key);
					hm.put(key, value + Integer.parseInt(sum));
				}
			}

		}

		System.out.println(hm);

	}

}
