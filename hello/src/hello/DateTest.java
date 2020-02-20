package hello;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		System.out.println("now:");
		System.out.println(date);
		Date date1 = new Date(5000);
		System.out.println(date1);
		
		System.out.println(date.getTime());
	
		System.out.println(System.currentTimeMillis());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String str1 = sdf1.format(date);
		System.out.println(str1);
		
		String str2 = "2020/02/02 06:06:06";
//		try {
//			Date date2 = sdf.parse(str2);
//			System.out.println(date2.toString());
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
		Calendar c = Calendar.getInstance();
		Date date3 = c.getTime();
		Date date4 = new Date(0);
		c.setTime(date4);
		
		Date now = date;
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		
		c.setTime(now);
		c.add(Calendar.YEAR, -1);
		
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DATE, 3);
	}

}
