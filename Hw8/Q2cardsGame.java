/*
 *  Imagine a very simple game showing random cards.
 *  Review class example:
 */
import java.util.*;
public class Q2cardsGame {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		char cont = 'y';
		do {
			System.out.print("\nPick one: " + "\n1.Rules" + "\n2.Game" + "\n0.Exit");
			int op = in.nextInt();
			switch (op) {
			case 1:	System.out.println("You will be randomly dealt a hand of 7 cards.");
					System.out.println("If you get a set or run or both you win, this is a take on gin rummy");
					System.out.println("A set is 3 or more cards with the same face value ");
					System.out.println("A run is 3 or more cards of consecutive rank with the same suit");
				break;
			case 2: game();
				break;
			case 0: System.out.println("Goodbye");	
		
			}
		System.out.println("\nDo you want to continue? y/n");
		cont = in.next().charAt(0);		
		}//do
		while (cont == 'y' || cont == 'Y');
		System.out.println("Goodbye");
	
	}//main
	static List sortface(List <card>A) {
		card hold = new card();
		boolean change = true;
		while(change){
			change = false;
			for(int i = 0; i < A.size()-1; i++){//run through list
				for (int j = 0; j < A.size()-1; j++) {
					if(A.get(i).getface() == A.get(i + 1).getface()){
						break;
					}//if
					if(A.get(i).getfpos() > A.get(i + 1).getfpos()){
						hold = A.get(i);
						A.set(i,A.get(i + 1));
						A.set(i+1, hold);
						change = true;
						//switches values of 2 positions
					}//if
				}//for
			}//for
		}//while
		System.out.println("Sorted hand: " + A);
		return A;
		}//sortcard
	static void game () {
		List <card> hand = new ArrayList <> ();
		List <card> set = new ArrayList <> ();
		List <card> run = new ArrayList <> ();
		
		for (int i = 0; i < 7; i++) {
			card x = new card();
			hand.add(x);
			//add to arraylist A
		}
		System.out.println("This is your hand: " + hand);
		
		List <card> A = sortface(hand);
		
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < A.size()-2; i++) {
			if(A.get(i).getfpos() == A.get(i+1).getfpos() && A.get(i+1).getfpos() == A.get(i+2).getfpos()){
				set.add(A.get(i));
				set.add(A.get(i+1));
				set.add(A.get(i+2));
				count1++;
			}
			if(A.get(i).getsuit() == A.get(i+1).getsuit() && A.get(i).getfpos() == A.get(i).getfpos()+1) {
				run.add(A.get(i));
				count2++;
			}//if	
		}//for
		
		if(count1 > 1 && count2 > 3) {
			System.out.print("You have a set and a run");
			System.out.print("Set: " + set);
			System.out.print("Run: " + run);
		}
		else if (count1 > 1) {
			System.out.println("You have set: ");
			System.out.println(set);
		}
		else if (count2 > 3) {
			System.out.println("You have a run: ");
			System.out.println(run);
		}
		else {
			System.out.println("You do not have a set or a run");
		}
		
		
		//if you have a pair you win
		
	}//game
}//class main

class card{
	//final means we can't change the values
	public final String Face = "123456789TJQKA";
	public final String Suit = "HCSD";
	public int fpos;
	char face;//2 3 ... 9 T(ten) J Q K A
	char suit;//hearts,club,spades,diamonds (H,C,S,D)
	
	card(){
		face = Face.charAt((int)(Math.random()*13));//0 ... 12
		fpos = Face.indexOf(face);
		suit = Suit.charAt((int)(Math.random()*4));//0 1 2 3 
	}
	/*public card(char face, char suit) {
		this.face = face;  
		this.suit = suit;
	}*/
	
	public char getface() {
		return face;
	}
	public int getfpos() {
		return fpos;
	}
	public char getsuit() {
		return suit;
	}
	public String toString() {
		return (face + " " + suit);
	}
	public void print() {
		System.out.println(toString() + " ");
	}
}//class card


