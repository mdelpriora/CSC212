//Ask for 3 integers. Display max and min

import java.util.*;
public class Q15Max3 {
	public static void main (String [] arg) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter 3 integers");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		if (n1 > n2 && n1 >n3)
			System.out.println("The maximum is " + n1);
		if (n2 > n1 && n2 > n3)
			System.out.println("The maximum is " + n2);
		if (n3 > n1 && n3 > n2)
			System.out.println("The maximum is " + n3);
		


	}


}
