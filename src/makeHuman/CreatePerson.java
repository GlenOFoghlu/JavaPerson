package makeHuman;

import date.LeapYear;
import makeHuman.PersonFunction;

import java.util.Calendar;

public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		Person p2 = new Person ("Trevor", "01/04/1978","Male");
		
		p1.setName("Nemo");
		p1.setDOB("27/07/1980");
		
		System.out.println(p1.getName());		
		System.out.println(p2.getName());
		
		PersonFunction pf = new PersonFunction();
		LeapYear ly = new LeapYear();
		
		String result = pf.compareDOB(p1.getDOB(),p2.getDOB());
		Boolean checkGender = pf.compare(p1.getGender(), p2.getGender());
		String leap = ly.Leap(p1.getDOB());
		
		System.out.println("This "+leap+" a leap year!");
		System.out.println(p1.getName()+" and "+p2.getName()+" are the same Gender: "+checkGender);
		
		System.out.println(result);

	}

}
