//Casino three dice game

import java.util.*;

public class Hw2_1 {
	public static void main (String [] arg) {
		Scanner in=new Scanner(System.in);

		System.out.println("Pick a section:");
		System.out.println("1.Authors" + " 2.Rules" + " 3.Play");
		int op=in.nextInt();
				
		switch (op) {
		case 1: System.out.println("This game was brought to you by Mia Delpriora and Shay Iyer.");
		case 2: 
		System.out.println("Here's how to play:");
        System.out.println("Type Y to roll the dice.");
        System.out.println("If you roll all multiples of two, you win $30.");
        System.out.println("If you roll three of the same number, you win $40.");
        System.out.println("If you roll a 6, you win $2.");
        System.out.println("You have 15 tries to make $50!");
        break;
		case 3:game();
		}
	}
	static int roll() { //1,2,3,4,5,6
        return (int) (Math.random() * 6) +1;
	}
	
	static void game() {
		int winnings = 0;
		int numrolls = 15;
		
		Scanner enter = new Scanner(System.in);
	    System.out.println("Press enter to roll the dice!");
	    enter.nextLine();

	    while (numrolls > 0) {
		int d1= roll();
		int d2= roll();
		int d3= roll();
		
		 System.out.println("You rolled " + d1 + "-" + d2 + "-" + d3);
         if ((d1 == d2) && (d2 == d3)) {
             System.out.println("Three of a kind! You win $40.");
             winnings += 10;
             if (winnings >= 50) {
            	System.out.println("You win!");
         	 	break;
         	  }
         }//if three of a kind
         
         if ((d1 % 2 == 0) && (d2 % 2 == 0) && (d3 % 2 == 0)) {
             System.out.println("Multiples of 2! You win $30.");
             winnings += 25;
             if (winnings >= 50) {
            	System.out.println("You win!");
         	 	break;
          }
         }//if multiple 2
         
         if ((d1 == 6) || (d2 == 6) || (d3 == 6)) {
             System.out.println("You rolled a 6! You win $2");
             winnings += 2;
             if (winnings >= 50) {
            	System.out.println("You win!");
         	 	break;
          }
         }//if six
         
         numrolls = numrolls - 1;
         System.out.println("You have " + numrolls + " rolls left. You have $" + winnings);
         
         Scanner enter2 = new Scanner(System.in);
         System.out.println("Press enter to roll again");
         enter2.nextLine();
         
         
     }//while
     
    	 
     if (numrolls == 0) System.out.println("You lose! Bye.");
 }//game
}//class

