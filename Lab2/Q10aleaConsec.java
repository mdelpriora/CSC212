//Roll 2 dice count how many times they are consecutive

import java.util.*; 
public class Q10aleaConsec {
	public static void main (String [] args) {
			Scanner in = new Scanner(System.in); 
			System.out.println("Enter an integer for how many times to roll the die");
			int n = in.nextInt();
		int count=0;
		for (int i=0; i<n; i++) {
			int d1 = (int) (Math.random()*6) + 1;
			int d2 = (int) (Math.random()*6) + 1;
				if (d1==d2-1 || d1==d2+1) {
				count++;
				}
			}
			System.out.println("The  rolls were consecutive " + count + " times." );
	}
}
