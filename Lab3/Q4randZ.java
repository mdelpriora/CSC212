// Generate random upper case letters till first Z and count how many times you tried.
public class Q4randZ {
	public static void main (String [] args) {
		
		char x;
		int count = 0;
		
		for (x = 'a'; x <= 'z'; x++) { 
		x = randlet();
		System.out.println(x);
		count++;
		}
		System.out.println("The computer tried " + count + " times before generating a z");
	}
	static char randlet() {
		return (char) ((int) (Math.random()*26) + 'a');
	}
}
	
