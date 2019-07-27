package thing;

import thing.PersonFunction;
import date.LeapYear;
import java.util.Calendar;

public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		//Person p2 = new Person();
		Person p2 = new Person ("Trevor", "01/04/1978","Male");
		
		p1.setName("Nemo");
		p1.setDOB("27/07/1980");
		
		System.out.println(p1.getName());
		
		System.out.println(p2.getName());
		
		PersonFunction pf = new PersonFunction();
		LeapYear ly = new LeapYear();
		
		String result = pf.compare(p1.getDOB(),p2.getDOB());
		
		String leap = ly.Leap(p1.getDOB());
		
		System.out.println("This "+leap+" a leap year!");
		
		System.out.println(result);

	}

}
