//Write a program to convert inches in centimeters.

import java.util.*;
public class Q13 {
	public static void main (String [] args) { 
	    final double INCHE2CM = 2.54;      /* 1 inch = 2.54 cm  */
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter a measurement in inches? ");   
		double inches = in.nextFloat();
        double  cm =  inches * INCHE2CM;
		System.out.print(inches + " inches = " + cm + " cm");
		}
	}
