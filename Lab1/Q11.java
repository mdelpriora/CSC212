//Write a program to display all cubes 1-n ( ask for n). HINT:

import java.util.*;
public class Q11 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("To what number cubed?");
		int n = input.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " cubed is " + Math.pow(i, 3));
		
		}
	}

}
