//Generate random upper case letters till first X, Y or Z.

public class Q5randxyz {
	public static void main (String [] args) {
		
		char x;
		int count = 0;
		
		for (x = 'A'; x <= 'X'; x++) { 
		x = randlet();
		System.out.println(x);
		count++;
		}
		System.out.println("The computer tried " + count + " times before generating a X,Y or Z");
	}
	static char randlet() {
		return (char) ((int) (Math.random()*26) + 'A');
	}
}
