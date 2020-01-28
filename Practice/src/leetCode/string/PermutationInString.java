package leetCode.string;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationInString {

	public static boolean checkInclusion(String s1, String s2) {

		boolean matcher = false;

		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		s1 = String.copyValueOf(arr1);
		System.out.println(s1);

		for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
			String str = s2.substring(i, i + s1.length());
			char[] arr2 = str.toCharArray();
			Arrays.sort(arr2);
			str = String.copyValueOf(arr2);
			
			if (s1.equals(str)) {
				matcher = true;
				break;
			}

		}

		return matcher;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidboaoo"));

//		Test Cases

// 		"hello"
//		"ooolleoooleh"
		
//		"ab"
//		"eidboaoo"
	}
}
