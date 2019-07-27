package date;
import java.util.Calendar;

import date.BasicDate;

public class CompareDate {
	
	public String compare(int year,int month, int day) {
		Calendar c = Calendar.getInstance();
		int yearNow=c.get(Calendar.YEAR);
		int monthNow=c.get(Calendar.MONTH)+1;
		int dayNow=c.get(Calendar.DAY_OF_MONTH);
		
		int tempY;
		int tempM;
		int tempD;
		
		String exactAge;
		
		tempY=(yearNow-year);
		tempM=(monthNow-month);
		tempD=(dayNow-day);
		
		return exactAge=tempY+" Years "+tempM+" Months "+tempD+" Days";		
	}
}
