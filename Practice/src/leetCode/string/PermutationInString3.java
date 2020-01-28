package leetCode.string;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationInString3 {

	public static boolean checkInclusion(String s1, String s2) {

		boolean matcher = false;

		int[] count1 = new int[26];
		int[] count2 = new int[26];


		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i)-'a');
			count1[s1.charAt(i)-'a']++;
			count2[s2.charAt(i)-'a']++;
		}

		System.out.println(Arrays.toString(count1));
		System.out.println(Arrays.toString(count2));

		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidboaboo"));

//		Test Cases

// 		"hello"
//		"ooolleoooleh"

//		"ab"
//		"eidboaoo"
	}
}
