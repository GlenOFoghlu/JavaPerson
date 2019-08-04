package shapeshifters;


	
public class Triangle extends Shape {
	
		   // Private member variables
		   private int base;
		   private int height;
		   
		   // Constructor
		   public Triangle(String color, int base, int height) {
		      super(color);
		      this.base = base;
		      this.height = height;
		   }
		   
		   @Override
		   public String toString() {
		      return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
		   }

		   @Override
		   public double getArea() {
		      return (base*0.5)*height;
		   }

		   @Override
		   public void drawMe() {

			   int i, j,k = 0; 
			   int b = base;
			   int h = height;
		        for (i = 1; i <= b; i++) 
		        { 
		            // Print spaces 
		            for (j = i; j < b; j++) { 
		                System.out.print(" "); 
		            } 
		            // Print # 
		            while (k != (2 * i - 1)) { 
		                if (k == 0 || k == 2 * i - 2) 
		                    System.out.print("*"); 
//		                    //System.out.print(k); 
//		                if(k%2==0)
//		                	System.out.print("~"); 
		                else
		                    System.out.print(" "); 
		                k++; 
		                ; 
		            } 
		            k = 0; 

		            System.out.println();  
		        } 
		        for (i = 0; i <h; i++) { 
		            System.out.print("*"); 
		        } 
		      
		   }
}
