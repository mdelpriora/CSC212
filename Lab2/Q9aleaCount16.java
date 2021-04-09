//Roll a die n times and count how many times your got a 6 or a 1

import java.util.*;
public class Q9aleaCount16 {
		public static void main (String [] args) {
			Scanner in = new Scanner(System.in); 
			System.out.println("Enter an integer for how many times to roll the die");
			int n = in.nextInt();
			int count=0;
			for (int i=0; i<n; i++) {
			int d = (int) (Math.random()*6) + 1;
				if (d==6 || d==1) {
				count++;
				}
			}
			System.out.println("You rolled a six or one " + count + " times." );

	}
}
