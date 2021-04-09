//You and the computer roll 2 dice. Winner is the one with greater sum. If a tie roll again.

public class Q8aleaGreaterSum {
	public static void main (String [] args) {
		int sum1= 1;
		int sum2= 1;
		
		while (sum1 == sum2) {
		sum1 = roll();
		sum2= roll(); 
		
		System.out.println("You rolled " + sum1);
		System.out.println("The computer rolled " + sum2);
		
		
		if (sum1 > sum2) {
			System.out.println("You win");
		}
		else if (sum1 < sum2){
			System.out.println("The computer wins");
		}
	}
		
}
	static int roll() {
		int d1 = (int)(Math.random()*6 + 1);
		int d2 = (int)(Math.random()*6 + 1);
		
		int sum= d1 + d2;
		return sum;
	}
}