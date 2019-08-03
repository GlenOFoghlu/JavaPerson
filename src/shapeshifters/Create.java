package shapeshifters;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s1 = new Rectangle("red", 4, 5);  // Upcast
	     System.out.println(s1);  // Run Rectangle's toString()
	     System.out.println("Area is " + s1.getArea());  // Run Rectangle's getArea()
	     s1.drawMe();
	      
	      Shape s2 = new Triangle("blue", 4, 5);  // Upcast
	      System.out.println(s2);  // Run Triangle's toString()
	      System.out.println("Area is " + s2.getArea());  // Run Triangle's getArea()
	      s2.drawMe();
	      
//	      shape s3 = new Shape("green");
//	      System.out.println(s3);
//	      System.out.println("Area is " + s3.getArea());  // Invalid output

	}

}
