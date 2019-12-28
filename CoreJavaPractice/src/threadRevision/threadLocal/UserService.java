package threadRevision.threadLocal;

import java.sql.Date;

public class UserService {

	public static void main(String[] args) {

		System.out.println(birthDate(10));
		
		for(int i=0;i<10;i++) {
			int id=i;
			new Thread(() ->{
				String value= birthDate(id);
				System.out.println(Thread.currentThread().getName()+
						"====id= "+id +" value= "+value);
			}).start();
		}
		
		
	}
	
	public static String birthDate(int userId) {
		return "User_"+(int)(Math.random()*10);
	}

}
