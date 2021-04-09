//Roll 3 dice check if they are consecutive
import java.util.*;
public class Q14aleaConsec {
	public static void main (String [] arg) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter how many times you want to roll the dice");
		int n= in.nextInt();
		int d1;
		int d2;
		int d3;
		int count = 0;
		
		for (int i=0; i <=n; i++) {
			d1 = roll();
			d2 = roll();
			d3 = roll();
			if(d2==(d1+1) && d3==(d1+2)) {
				count++;
				System.out.println("Your rolled: " + d1 + ", " + d2 +" and " + d3);
			}//if
		}//for
		System.out.println("You rolled " + count + " consecutive rolls");
		
	}
	static int roll() {
		return ((int) (Math.random()*6) + 1);
		
	}

}
