package jpmc;

public class FIndNumberFromString {
	public static void main(String[] args) {
		
		String str= "a1b2c3d4";
		
		char[] arr= str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			int x= arr[i];
			if(x >= 48 && x<=57) {
				System.out.println("====numeric====="+arr[i]);
			}
		}
		
	}
}
