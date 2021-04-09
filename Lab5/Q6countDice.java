/*
 * Roll a die 10 times. Report frequency of each integer 1-6
 */
public class Q6countDice {
	public static void main(String[] args) {
		
		int[] frequency = new int[26];
		int d; 
		for (int i = 0; i <10; i++) {
			d = (int) (Math.random()*6 + 1);
			frequency[d]++;
		}
		for (int i=0; i<=6; i++) {
			d = (int)(i);
		System.out.println("Frequency of " + d + " = " + frequency[i]);
		}
	}
}
