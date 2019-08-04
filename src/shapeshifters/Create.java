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
	      
	      Shape s3 = new Circle("Green", 5);  // Upcast
	      System.out.println(s3);  // Run Triangle's toString()
	      System.out.println("Area is " + s3.getArea());  // Run Triangle's getArea()
	      s3.drawMe();
	      

	}

}
