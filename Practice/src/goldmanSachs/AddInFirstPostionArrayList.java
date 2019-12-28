package goldmanSachs;

import java.util.ArrayList;

public class AddInFirstPostionArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> l= new ArrayList<Integer>();
		l.add(2);
		l.add(1);
		System.out.println(l);
		l.add(0);
		for(int i=l.size()-1;i>0;i--) {
			l.set(i, l.get(i-1));
		}
		l.set(0, 3);
		
		System.out.println(l);

		
	}
}
