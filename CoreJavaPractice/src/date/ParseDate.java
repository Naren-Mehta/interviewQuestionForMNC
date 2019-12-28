package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDate {
	public static void main(String[] args) {

		String dateStr="2019-10-17";
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

		try {
			Date date=sdf.parse(dateStr);
			System.out.println(date);
			System.out.println(new Date());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
