package homeChallanges.string;

public class StringReverse1 {

	public static String reverse(String str) {

//		List<Character> list=str.chars().mapToObj(c -> (char)c ).collect(Collectors.toList());
//		Collections.reverse(list);

		StringBuffer f = new StringBuffer(str);
		return f.reverse().toString();

	}

	public static void main(String[] args) {

		System.out.println(reverse("narendra"));

	}

}
