// Roll 3 dice until you have at least a double
public class Q13alea3Double {
	public static void main (String [] arg) {
		int d1;
		int d2;
		int d3;
		
		do {
		 d1 =roll();
		 d2 =roll();
		 d3 =roll();
		}
		while (d1 != d2 && d2 != d3 && d1!= d3);
		System.out.println("You rolled " + " " +d1 + ", " +  d2 + " and " + d3);
	}

		static int roll() {
			return ((int) (Math.random()*6) + 1);
		}
}
