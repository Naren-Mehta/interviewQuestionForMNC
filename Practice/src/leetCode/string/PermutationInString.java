package leetCode.string;

import java.util.HashMap;

public class PermutationInString {

	public static boolean checkInclusion(String s1, String s2) {
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);

		
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(hm.containsKey(c)) {
				
			}
		}
		
		
		
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidbaooo"));
	}
}
