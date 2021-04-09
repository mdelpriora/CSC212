//Roll 2 dice till first double. Count how many times you tried

public class Q6aleadice2 {
	public static void main (String [] args) { 
		
		int d1=0, d2=1, count=0;
		while(d1 != d2)
			d1 = (int) (Math.random()*6) + 1;
			d2 = (int) (Math.random()*6) + 1;
			System.out.println("You rolled a " + d1 + " and a " + d2);
			count++;
		//	for (int i=0; i<n; i++) {
			
				System.out.println("It took " + count + " rolls to get a double");
			}
}
//}
