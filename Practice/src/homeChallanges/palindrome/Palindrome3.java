package homeChallanges.palindrome;

public class Palindrome3 {

	public static boolean isPalindrom(String str) {

		StringBuffer f= new StringBuffer(str);
		if(f.reverse().toString().equals(str)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrom("madam"));
	}

}
