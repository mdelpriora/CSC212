//Ask for the coefficients a,b,c and solve the quadratic equation: ax^2 + bx + c = 0

import java.util.*;
public class Q16QuadFormula {
	public static void main (String [] arg) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter 3 numbers larger than 0 to enter into the quadratic equation (a,b,c)");
		double a = in.nextInt();
		double b = in.nextInt();
		double c = in.nextInt();
		double determinant= b*b-4*a*c;
		double x1,x2;
		if(determinant > 0) {
		 x1=(-b+Math.sqrt(determinant))/(2*a);
		 x2=(-b-Math.sqrt(determinant))/(2*a);
		System.out.println("x = " + x1 + " or " + x2);
		}
		
		else if (determinant==0) {
			x1=x2=-b/(2*a);
		System.out.println("x = " + x1);
		}
		
		else {
			double real = (-b/2*a);
			double imaginary = Math.sqrt(-determinant)/(2*a);
			
			System.out.println("x1= " + real + " + " + imaginary +'i');
			System.out.println("x2= " + real + " - " + imaginary +'i');

			
		}
			
			
		}
		
	}
			

