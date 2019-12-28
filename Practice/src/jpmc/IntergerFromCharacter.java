package jpmc;

public class IntergerFromCharacter {
	
	public static void main(String[] args) {
		
		String st="a1b2c3d4";
		
		char[] arr= st.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(!Character.isDigit(arr[i])) {
				System.out.println(arr[i]);
			}
			
		}
		
		System.out.println(Character.isDigit('c'));
		
//		char c='1';
//				
//		int i= Character.getNumericValue(c);
//		
//		System.out.println(i);
		
	}

}
