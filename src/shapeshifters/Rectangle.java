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

			    for(int i=1; i<=length; i++)
			    { 
			        for(int j=1; j<=width; j++)
			        {
			            if(i==1 || i==length || j==1 || j==width)
			            {
//			               if (i==1 ||)
//			               {
//			            	   System.out.print("|");  
//			               }
			            	System.out.print("-");
			            }
			            else
			            {
			            	System.out.print(" ");
			            }
			        }

			        System.out.println();
			    }
		   }
}
