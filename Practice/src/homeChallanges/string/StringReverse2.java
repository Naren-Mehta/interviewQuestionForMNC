package homeChallanges.string;

public class StringReverse2 {

	public static String reverse(String str) {
		String rev="";
		
		for(char c: str.toCharArray()) {
			rev = c+rev;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverse("narendra"));
		
		
	}

}
