package date;

public class LeapYear {
	
	public static String Leap(int year)
	{		
		 String flag;
	        if(year % 400 == 0)
	        {
	            flag = "is";
	        }
	        else if (year % 100 == 0)
	        {
	            flag = "is not";
	        }
	        else if(year % 4 == 0)
	        {
	            flag = "is";
	        }
	        else
	        {
	            flag = "is not";
	        }
	        return flag;
	}
	
	public static String Leap(String dob)
	{		
		String[] temp;
		
		temp = dob.split("/");

		int day = Integer.parseInt(temp[0]);	
		int month = Integer.parseInt(temp[1]);	
		int year = Integer.parseInt(temp[2]);
		
		
		 String flag;
	        if(year % 400 == 0)
	        {
	            flag = "is";
	        }
	        else if (year % 100 == 0)
	        {
	            flag = "is not";
	        }
	        else if(year % 4 == 0)
	        {
	            flag = "is";
	        }
	        else
	        {
	            flag = "is not";
	        }
	        return flag;
	}
}
