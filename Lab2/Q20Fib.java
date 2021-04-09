//Fibonacci program

import java.util.Scanner;
public class Q20Fib {
	public static void main (String [] args) { 
		Scanner in=new Scanner(System.in);
		System.out.println("Enter how many Fibonacci values you want");
		int n= in.nextInt();
		System.out.println("Fibonacci value "+  n + " is equal to " + fib(n));
		listfib(n);
	}//main

static int fib(int n) {
	if (n==0 || n==1)
		return 1;
	else
		return fib(n-2) + fib(n-1);
	}
	
	static void listfib(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " != " + fib(i));
		}//for
	}//List fact
}
