package makeHuman;

import java.util.Calendar;

public class PersonFunction {
	
	public static String compareDOB(String p1DOB, String p2DOB)
	{
		String[] temp;
		String[] temp2 = null;
				
		temp = p1DOB.split("/");
		temp2 = p2DOB.split("/");

		int d1 = Integer.parseInt(temp[0]);	
		int m1 = Integer.parseInt(temp[1]);	
		int y1 = Integer.parseInt(temp[2]);
		
		int d2 = Integer.parseInt(temp2[0]);	
		int m2 = Integer.parseInt(temp2[1]);	
		int y2 = Integer.parseInt(temp2[2]);
		
		Calendar c = Calendar.getInstance();
		int yearNow=c.get(Calendar.YEAR);
		int monthNow=c.get(Calendar.MONTH)+1;
		int dayNow=c.get(Calendar.DAY_OF_MONTH);
		
		int tempY;
		int tempM;
		int tempD;
		
		String exactAge;
		
		tempY=(y1-y2);
		tempM=(m1-m2);
		tempD=(d1-d2);
		
		return exactAge=tempY+" Years "+tempM+" Months "+tempD+" Days";	
		
	}
	public static boolean compare(String part1, String part2)
	{
		Boolean c;
		
		c = part1.equals(part2);		
		
		return c;
		
	}
	

}
