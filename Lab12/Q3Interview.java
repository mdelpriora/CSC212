/*
 *  Given an int n return the smallest number with the same number of digits
 *  Use only one function main(); 
 *  Ex. n = 245 res = 100; 
 *  for n = 10 res = 10; 
 *  for n = 1 res = 0
 *  af - Mia Delpriora
 */
import java.util.*;
public class Q3Interview {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer");
		int n = in.nextInt();
		int n2 = String.valueOf(n).length();//number of digits
		
		int result = (int) Math.pow(10, n2 - 1);
		
		if(n != 0) {
		System.out.println("Smallest number with the same number of digits as " + n + ":");
		System.out.println(result);
		}
		
	}
}
