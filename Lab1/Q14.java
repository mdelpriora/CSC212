//Convert Fahrenheit degrees to Celsius and vice versa

public class Q14 {
	public static void main (String [] args) { //  always starts execution from main() function
		System.out.println("Fahrenheit to Celsius table") ; //prints
		double c;  
		for (int f = 60; f < 100 ; f = f + 2) {
			c = (f - 32.0) * 5 / 9.0;
			System.out.print("f=" + f + "\tc:");
			System.out.printf("\t%.2f",c);
			System.out.println();
		}
	}
}
