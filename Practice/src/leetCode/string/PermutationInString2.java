package leetCode.string;

import java.util.HashMap;

public class PermutationInString2 {

	public static boolean checkInclusion(String s1, String s2) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		boolean matcher = false;
		int count = 0;
		
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if (hm.containsKey(c)) {
				int num= hm.get(c);
				if(num-1 ==0) {
					hm.remove(c);
				}else {
					hm.put(c, num-1);
				}
				count++;
			} else {
				count = 0;
			}
			if (count == s1.length()) {
				matcher = true;
				break;
			}

		}

		return matcher;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("adc", "adadc"));

//		Test Cases

// 		"hello"
//		"ooolleoooleh"
	}
}
