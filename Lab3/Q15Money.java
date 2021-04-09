/*Write a program for money conversion using a Menu
 * If you do not type (1-3) the program will ask you again "Choose option?"
 * After you get the answer the program will ask you if you want to "Continue(y/n)?
 */

import java.util.*; 
public class Q15Money {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a selection:" + "\n1.USD => EUR " + "\n2.EUR =>USD" + "\n3.USD => CAN");
		char control = 'Y';
		do {
			int op;
		
			do {
			System.out.println("Pick a menu option:");
			op = in.nextInt();
			}//do 2
			while(op < 1 || op > 3);
		
		conversion(op);
		System.out.println("Do you want ot convert again? Y/N");
		control = in.next().charAt(0);
		
		}//do 1
		while (control == 'Y' || control == 'y');
	
	}//main
	
	static void conversion(int op) {
		Scanner in = new Scanner(System.in);
		switch(op) {
		case 1: 
			System.out.println("Enter amount of money in USD");
			double usd = in.nextInt();
			double eur = usd *.85;
			System.out.println(usd + " USD is equivalent to " + eur + " EUR.");
		break;
		case 2:
			System.out.println("Enter amount of money in USD");
			double EUR = in.nextInt();
			double USD = EUR*1.85;
			System.out.println(EUR + " EUR is equivalent to " + USD + " USD.");
		break;
		case 3: 
			System.out.println("Enter amount of money in USD");
			double Usd = in.nextInt();
			double CAN = Usd*1.85;
			System.out.println(Usd + " USD is equivalent to " + CAN + " CAN.");
		break;
		default: System.out.println("error");
				
		}//switch
	}//conversion
}
