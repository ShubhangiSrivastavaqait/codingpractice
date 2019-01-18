import java.util.*;
   public class AreaShape 
   { /* functions to calculate area of different shapes */
   static double area = 0.0; 
   static double result = 0.0;
	public static double areacircle(double radius) {
	   area = 3.14 * radius * radius; 
	   return area;
	}
	public static double areasquare(double side) {
	   area = side * side ;
	   return area ;
	}
	public static double arearectangle(double length, double breadth) {
	   area = length * breadth;
	   return area;
	}
	public static double areatriangle (double base, double altitude) {
	   area = 0.5 * base * altitude;
	   return area;
	}
     public static void main( String[] args )
     {		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input");
	String str = sc.nextLine();	
	  if ( str.equalsIgnoreCase("circle") ) {
	     System.out.println("Enter radius as input");
	     double r = sc.nextDouble();
	     result = AreaShape.areacircle(r);/* static method calling by class */
	     System.out.println("Area calculated of the circle is" +result);
	  }
	  else if ( str.equalsIgnoreCase("rectangle") ) { 
	       System.out.println("Enter the length and breadth as input");
	       double l = sc.nextDouble();
	       double b = sc.nextDouble();
	       result = AreaShape.arearectangle(l,b);/* static method calling by class */
	       System.out.println("Area calculated of the rectangle is" +result);
	    }
	  else if ( str.equalsIgnoreCase("square") ) {
	      System.out.println("Enter the side as input");
	      double a = sc.nextDouble();
	      result = AreaShape.areasquare(a);/* static method calling by class */
	      System.out.println("Area calculated of the rectangle is" +result);
	    }
	  else if (str.equalsIgnoreCase("triangle") ) { 
	      System.out.println("Enter the base and altitude as input");
	      double ba = sc.nextDouble();
	      double al = sc.nextDouble();
	      result = AreaShape.arearectangle(ba,al);/* static method calling by class */
	      System.out.println("Area calculated of the triangle is" +result);
	    }
	  else { 
		 System.out.println("Enter the input correctly");/*error message if no condition matches*/
		} 
	} 
}
