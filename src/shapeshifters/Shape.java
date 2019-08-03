package shapeshifters;

public class Shape {
	
	private String colour;
	private String type;
	private int line;
		
	 public Shape(String colour) {
		// TODO Auto-generated constructor stub
		 this.colour = colour;
	}

	@Override
	 public String toString() {
	      return "Shape[colour=" + colour + "]";
	 }
	   
	  public double getArea() {
	      // We have a problem here!
	      // We need to return some value to compile the program.
	      System.err.println("Shape unknown! Cannot compute area!");
	      return 0;
	   }
	  
	  public void drawMe() {
		  System.err.println("Shape unknown! Cannot Draw");
	   }
		  
	public String getType() {
		return type;
	}
		  
	public int getLine() {
		return line;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setType(String type) {
		this.type = type;
	}
		  
	public void setLine(int line) {
		this.line = line;
	}
}
