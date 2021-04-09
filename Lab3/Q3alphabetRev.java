//Write a function alphaRev() that prints the English alphabet in reverse
//Upper case and lower case

public class Q3alphabetRev {
	public static void main (String [] args) {
			
		alpharev();
		
	}//main
	static void alpharev() {
		for (char ch='Z',s ='z'; ch >='A'; ch--, s--) {
			System.out.println(ch + " " + s);
			
		}
	}
}
