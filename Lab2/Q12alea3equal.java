//Roll 3 dice check till they are all equal
import java.util.*;
public class Q12alea3equal {
	public static void main (String [] arg) {
		Scanner in=new Scanner(System.in);
		int d1 =(int) (Math.random()*6) + 1;
		int d2 =(int) (Math.random()*6) + 1;
		int d3 =(int) (Math.random()*6) + 1;
		
		if (d1 != d2 && d2 != d3) {
			d1 =(int) (Math.random()*6) + 1;
			d2 =(int) (Math.random()*6) + 1;
			d3 =(int) (Math.random()*6) + 1;
		}
		else {
			System.out.println("You rolled three of a kind");
			System.out.println("You rolled " + d1 + " " + d2 + " " + d3);
		}
		
		
	}
}
