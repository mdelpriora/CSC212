//Roll a dice n times count how many times it was a 6

import java.util.*; 
public class Q5aleadice1 {
	public static void main (String [] args) {
	Scanner in = new Scanner(System.in); 
	System.out.println("Enter an integer for how many times to roll the die");
	int n = in.nextInt();
	int count=0;
	for (int i=0; i<n; i++) {
	int d = (int) (Math.random()*6) + 1;
		if (d == 6) {
		count++;
		}
	}
	System.out.println("You rolled a six " + count + " times." );

}
}
