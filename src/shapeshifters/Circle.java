package shapeshifters;

public class Circle extends Shape {
	
		   // Private member variables
		   private int radius;
		   
		   // Constructor
		   public Circle(String color, int radius) {
		      super(color);
		      this.radius= radius;
		   }
		   
		   @Override
		   public String toString() {
		      return "Circle[radius=" + radius+ "," + super.toString() + "]";
		   }

		   @Override
		   public double getArea() {
			   double pi = Math.PI;
			   double r2 = Math.pow(radius, 2);
		      return  pi * r2;
		   }

		   @Override
		   public void drawMe() {

			// dist represents distance to the center 
			    double dist; 
			  
			    // for horizontal movement 
			    for (int i = 0; i <= 2 * radius; i++) { 
			  
			    // for vertical movement 
			    for (int j = 0; j <= 2 * radius; j++) { 
			        dist = Math.sqrt((i - radius) * (i - radius) + 
			                         (j - radius) * (j - radius)); 
			  
			        // dist should be in the range (radius - 0.5) 
			        // and (radius + 0.5) to print stars(*) 
			        if (dist > radius - 0.5 && dist < radius + 0.5) 
			        System.out.print("*"); 
			        else
			        System.out.print(" "); 
			    } 
			  
			    System.out.print("\n"); 
			    } 
		   }
}
