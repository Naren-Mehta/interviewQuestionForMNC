package threadRevision.threadLocal;

import java.sql.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserService2 {

	public static void main(String[] args) {


		ExecutorService service = Executors.newFixedThreadPool(10);
		
		for(int i=0;i<1000;i++) {
			int id=i;
			service.submit(() ->{
				String value= birthDate(id);
				System.out.println(Thread.currentThread().getName()+
						"====id= "+id +" value= "+value);
			});
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static String birthDate(int userId) {
		return "User_"+(int)(Math.random()*10);
	}

}
