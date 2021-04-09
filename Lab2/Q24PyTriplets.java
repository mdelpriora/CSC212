//Display all pythagorean triplets with integers between 1 and 100.

public class Q24PyTriplets {
	public static void main (String [] args) { 			
		
	for (int a=1; a <=100; a++) {
		
		for (int b=a; b <=100; b++) {
		
			for (int c=b; c <=100; c++) {
	
				if ((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c, 2)) //Checks if satisfiess pythagorean theorem
					System.out.println("" + a + '-' + b + '-' + c); //Ouput result
		
				}
			}
		}
	}
}

