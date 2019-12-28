package leetCode.string;

import java.util.ArrayList;

public class SplitAString {

	public static int balancedStringSplit(String s) {

		int x = 0;
		ArrayList<String> list = new ArrayList<String>();
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			str = str + c;
			if (c == 'L') {
				x++;
			} else {
				x--;
			}

			if (x == 0) {
				list.add(str);
				str = "";
			}
		}
		
		return list.size();
	}

	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRRLLRLL"));
	}

}
