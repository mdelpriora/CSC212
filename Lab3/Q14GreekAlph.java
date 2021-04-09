/*Print the first letters in the Greek alphabet
 * alpha is '\u03B1'
 * Print as many as possible.
 */
public class Q14GreekAlph {
	public static void main (String [] args) {
		
		System.out.println("The following is the greek alphabet:");
		for (int i = 0; i <24; i++) {
			System.out.println((char)('\u03B1' + i));
		}
	}
}
