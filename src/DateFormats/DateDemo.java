package DateFormats;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTest dt = new DateTest();
//		dt.dayManupulate("yyyy-MM-dd", 4, "Add");
		dt.setTimeZone("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	}

}

class DateTest{
	public void dayManupulate(String datePattern, int numDayToManupulate, String operation){
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat(datePattern);
		Date date = new Date();
		String formattedDate = dateFormat.format(date);
		try {
			cal.setTime(dateFormat.parse(formattedDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (operation.equalsIgnoreCase("Add")) {
			cal.add(Calendar.DATE, numDayToManupulate);
		}
		if (operation.equalsIgnoreCase("Subtract")) {
			cal.add(Calendar.DATE, -numDayToManupulate);
		}
		
		String formattedDate2 = dateFormat.format(cal.getTime());
		
		System.out.println("Formatted Current Date - "+formattedDate2);
		
		/*if (condition) {
			
		}*/

	}
	
	public void setTimeZone(String datePattern){
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat(datePattern);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		Date date = new Date();
		String formattedDate = dateFormat.format(date);
		System.out.println("UST Current Date - "+formattedDate);
		ZonedDateTime zdt = ZonedDateTime.parse(formattedDate, DateTimeFormatter.ISO_ZONED_DATE_TIME);
		ZoneId zid = zdt.getOffset();
		System.out.println("Time Zone - "+zid);
	}
	
	public void dateCompare(String datePattern){
		DateFormat dateFormat = new SimpleDateFormat(datePattern);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IST"));
		Date date = new Date();
		String formattedDate = dateFormat.format(date);
	}
}
