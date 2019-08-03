package shapeshifters;


	
public class Rectangle extends Shape {
	
		   // Private member variables
		   private int length;
		   private int width;
		   
		   // Constructor
		   public Rectangle(String color, int length, int width) {
		      super(color);
		      this.length = length;
		      this.width = width;
		   }
		   
		   @Override
		   public String toString() {
		      return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
		   }

		   @Override
		   public double getArea() {
		      return length*width;
		   }

		   @Override
		   public void drawMe() {
			   for (int i = 1; i <= length; i++) {
			         for (int j = 0; j < width; j++) {
			            System.out.print("-");			           
			         }
			        System.out.println("+");
			      }			   
		   }
}
