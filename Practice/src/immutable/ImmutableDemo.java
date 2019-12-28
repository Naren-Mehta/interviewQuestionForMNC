package immutable;

import java.util.ArrayList;
import java.util.List;

final class MyDemo {

	final int id;
	final String value;
	final List<String> addressList;

	public MyDemo(int id, String value, List<String> addressList) {
		this.id = id;
		this.value = value;
		this.addressList = addressList;
	}
	
	public int hashCode() {
		System.out.println("======");
		return addressList.hashCode();
	}


	@Override
	public String toString() {
		return id+""+addressList.hashCode();
	}

}

public class ImmutableDemo {
//	public static void main(String[] args) {
//
//		List<String> addressList = new ArrayList<String>();
//		addressList.add("Delhi");
//
//		MyDemo d1 = new MyDemo(1, "hello", addressList);
//		MyDemo d2 = new MyDemo(2, "Hi", addressList);
//
//		System.out.println(d1.toString());
//		System.out.println(d2.toString());
//
//		addressList.add("bengalore");
//
//		System.out.println(d1);
//		System.out.println(d2);
//
//	}
	
	  public static void main(String[] args) {
          
		  ImmutableDemo tc= new ImmutableDemo();
		  
		  throw new ArithmeticException();
//          System.out.println(" "+10+20);
   }
   
   public int test(){
          
          try{
                 return 1;
          }catch(Exception e){
                 return 2;
          }finally{
                 return 3;
          }
   }
}
