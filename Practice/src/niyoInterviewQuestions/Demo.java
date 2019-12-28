package niyoInterviewQuestions;

public class Demo {

	int i=20;
	
	public static void main(String[] args) {
		
		int a=5;
		int b=a;
		
		System.out.println(a +","+b);
		b++;
		System.out.println(a +","+b);

		Demo d1= new Demo();
		Demo d2=d1;
		
		System.out.println(d1.i +", "+d2.i);
		d2.i=200;
		System.out.println(d1.i +", "+d2.i);

		
	}

}
