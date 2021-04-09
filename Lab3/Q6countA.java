// Generate n = 20 random upper case letters and report the number of A's and B's.
public class Q6countA {
	public static void main (String [] args) {
		int n=20;
		int count = 0;
		int count1 = 0;
		char x;
		for (int i = 0; i< n; i++) {
			x= randlet();
			System.out.println(x);
			
			if (x == 'A') {	
			count++;
			}
			
			if (x == 'B') {	
			count1++;
			}
		}
		System.out.println("You got " + count + " A's and " + count1 + " B's");
			
	}
	static char randlet() {
		return (char) ((int) (Math.random()*26) + 'A');
	}
}
	
