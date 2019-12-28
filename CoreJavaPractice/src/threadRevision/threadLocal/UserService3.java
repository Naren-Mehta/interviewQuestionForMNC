package threadRevision.threadLocal;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadSafeFormatter{
	public static ThreadLocal<SimpleDateFormat> dateFormatter= new ThreadLocal<SimpleDateFormat>();
	
	protected SimpleDateFormat initialValue() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public SimpleDateFormat get() {
		return initialValue();
	}
	
}


public class UserService3 {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		System.out.println("================test=============");
		for(int i=0;i<10;i++) {
			int id=i;
			service.submit(() ->{
				String value= birthDate(id);
				System.out.println(Thread.currentThread().getName()+
						"====id= "+id +" value= "+value);
			});
		}
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}
	
	public static String birthDate(int userId) {
		System.out.println("userId "+userId);
		int day=(int)(Math.random()*100)%31;
		int month=(int)(Math.random()*100)%12 == 0? 1:(int)(Math.random()*100)%12;		
		day= day==0?day+1:day;
		month= month ==0?month+1:month;
		String birthDate=""+(day/10 >0 ?day: "0"+day)+"-"+(month/10>0 ?month: "0"+month) +"-2019";
		System.out.println(birthDate);
		final SimpleDateFormat df= ThreadSafeFormatter.dateFormatter.get();
		System.out.println(df.format(birthDate));
		return df.format(birthDate);
	}

}
