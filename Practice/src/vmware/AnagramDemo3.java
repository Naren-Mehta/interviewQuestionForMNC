package vmware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class AnagramDemo3 {

	public static String sortString(String str) {

		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		str = String.copyValueOf(arr);
		return str;

	}

	public static void main(String[] args) {

		String s2 = "this isht is a naren neran binary nibary adobe abode";

		String[] strArr = s2.split(" ");

		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i].length() > 1) {
				String sortedStr = sortString(strArr[i]);

				if (hm.containsKey(sortedStr)) {
					List<String> list = hm.get(sortedStr);
					if (!list.contains(strArr[i])) {
						list.add(strArr[i]);
					}
					hm.put(sortedStr, list);
				} else {
					List<String> list = new ArrayList<String>();
					list.add(strArr[i]);
					hm.put(sortedStr, list);
				}
			}

		}

		System.out.println(hm);
		
		
		

	}

}
