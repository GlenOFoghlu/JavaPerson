package thing;

public class Person {
	
	 private String name; // private = restricted access
	 private String dob; // private = restricted access
	 private String gender; // private = restricted access

	 public Person() {
		   this.name = "Human";
		   this.dob = "1/1/2000";
		   this.gender = "Male";
		}
	 
	 public Person(String name, String dob, String gender) {
		   this.name = name;
		   this.dob = dob;
		   this.gender = gender;
	 }
	 
	 
	  public String getName() {
	    return name;
	  }
	  
	  public String getDOB() {
		    return dob;
	  }
	  
	  public String getGender() {
		    return gender;
	  }

	  public void setGender(String gender) {
	    this.gender = gender;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public void setDOB(String dob) {
		this.dob = dob;
	  }

}
