package Day3_OperatorAndLoops;

public class DoWhileLoop {
public static void main(String[] args) {
	int[] arr = {10,20,30,40,50};
	int i=0;
	
	do {
		System.out.println(arr[i]);
		i++;
	}while(i<arr.length);
	
	
	
	System.out.println("===for loop===");
	
	for(int j=arr.length-1;j>=0;j--) {
		System.out.println(arr[j]);
	}
	
	System.out.println("===while===");

	int k=0;
	while(k<arr.length) {
//		System.out.println(arr[k]);
		k++;
	}
	
	System.out.println("====hello=======");
	
	
}
}
