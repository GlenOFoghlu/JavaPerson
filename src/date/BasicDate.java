package date;
import date.LeapYear;
import java.util.Calendar;

public class BasicDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String date = "19/7/2020";
			String[] temp;
			
			System.out.println(date);
			
			temp = date.split("/");

			int day = Integer.parseInt(temp[0]);	
			int month = Integer.parseInt(temp[1]);	
			int year = Integer.parseInt(temp[2]);
			
			LeapYear ly = new LeapYear();
			
			String leap = ly.Leap(year);
					
			String age = age(year,month,day);
			
			System.out.println("This "+leap+" a leap year!");
			System.out.println("You are exaclty "+age+" old");
			
	}
	
	public static String age(int year,int month,int day)
	{
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
