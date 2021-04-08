//Write a program to convert bytes in bits.

import java.util.*;
public class Q12 {
	public static void main (String [] args) { 
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter number of bytes? ");
		int bbyte = in.nextInt();
		int bit  =  bbyte * 8;
		System.out.print(bbyte + " bytes= " +  bit + " bits");
		System.out.print("\nEnter mega bytes? ");
		float mb = in.nextFloat();  // mega bytes
		bbyte = (int)(mb * Math.pow(2,10));  // 1024
		System.out.print(mb + " mega bytes = " +  bbyte + " bytes");
		}
	}
