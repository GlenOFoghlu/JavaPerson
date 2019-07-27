package thing;

import java.util.Calendar;

public class PersonFunction {
	
	public static String compare(String p1DOB, String p2DOB)
	{
		String[] temp;
		String[] temp2 = null;
				
		temp = p1DOB.split("/");
		temp2 = p2DOB.split("/");

		int day1 = Integer.parseInt(temp[0]);	
		int month1 = Integer.parseInt(temp[1]);	
		int year1 = Integer.parseInt(temp[2]);
		
		int day2 = Integer.parseInt(temp2[0]);	
		int month2 = Integer.parseInt(temp2[1]);	
		int year2 = Integer.parseInt(temp2[2]);
		
		Calendar c = Calendar.getInstance();
		int yearNow=c.get(Calendar.YEAR);
		int monthNow=c.get(Calendar.MONTH)+1;
		int dayNow=c.get(Calendar.DAY_OF_MONTH);
		
		int tempY;
		int tempM;
		int tempD;
		
		String exactAge;
		
		/*
		tempY=(yearNow-year);
		tempM=(monthNow-month);
		tempD=(dayNow-day);
		*/
		
		tempY=(year1-year2);
		tempM=(month1-month2);
		tempD=(day1-day2);
		
		return exactAge=tempY+" Years "+tempM+" Months "+tempD+" Days";	
		
	}

}
